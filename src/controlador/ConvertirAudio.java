package controlador;

import modelo.Audio;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ConvertirAudio {

    public static GestionAudio gestionAudio;
    public static String textoArchivo;
    public static ArrayList<Audio> audio = new ArrayList<Audio>();

    public static void nuevoAudio(String nombreAudio, String cadena) {
        gestionAudio = new GestionAudio();

        if (nombreAudio.substring(nombreAudio.lastIndexOf(".")).equals(".txt")) {
            gestionAudio.crearAudio(nombreAudio.substring(0, nombreAudio.lastIndexOf(".")), cadena, "es-ES_EnriqueVoice");
        } else {
            if (nombreAudio.substring(nombreAudio.lastIndexOf(".")).equals(".dat")) {
                gestionAudio.crearAudio(nombreAudio.substring(0, nombreAudio.lastIndexOf(".")), cadena, "es-ES_EnriqueVoice");
            } else {
                if (nombreAudio.substring(nombreAudio.lastIndexOf(".")).equals(".doc")) {
                    gestionAudio.crearAudio(nombreAudio.substring(0, nombreAudio.lastIndexOf(".")), cadena, "es-ES_EnriqueVoice");
                } else {
                    if (nombreAudio.substring(nombreAudio.lastIndexOf(".")).equals(".docx")) {
                        gestionAudio.crearAudio(nombreAudio.substring(0, nombreAudio.lastIndexOf(".")), cadena, "es-ES_EnriqueVoice");
                    }
                }
            }
        }
    }

    public static void gestionAgregarAudio(String rutaAudio) throws IOException {
        File carpetaContenedoraTextos = new File(rutaAudio);

        String[] listadoCarpeta = carpetaContenedoraTextos.list();
        if (listadoCarpeta == null || listadoCarpeta.length == 0) {
            JOptionPane.showMessageDialog(null, "Error: \n\n 1. No ha seleccionado la carpeta \n 2. No hay ningun archivo de texto en la carpeta seleccionada \n\n Intente de nuevo");
            return;
        } else {
            for (int i = 0; i < listadoCarpeta.length; i++) {
                if (listadoCarpeta[i].contains(".txt") || listadoCarpeta[i].contains(".dat") || listadoCarpeta[i].contains(".doc") || listadoCarpeta[i].contains(".docx")) {

                    Audio audioArchivo = new Audio();
                    audioArchivo.setRuta(rutaAudio + "\\" + listadoCarpeta[i]);
                    audioArchivo.setNombre(listadoCarpeta[i]);
                    sacarTextoArchivos(rutaAudio + "\\" + listadoCarpeta[i]);
                    audioArchivo.setContenido(textoArchivo);
                    textoArchivo = "";

                    audio.add(audioArchivo);
                }
            }

            
            ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() - 1);
            System.out.println("Cores PC: " + Runtime.getRuntime().availableProcessors());
            for (int i = 0; i < audio.size(); i++) {
                Runnable worker = new ConvertirHilo(audio, i, audio.size());
                executor.execute(worker);

                System.out.println(
                        String.format("Concurrete hilo %s printing value %s", Thread.currentThread().getName(), audio.get(i).getNombre()));

            }
            
            executor.shutdown();
            while (!executor.isTerminated()) {
            }
            JOptionPane.showMessageDialog(null, "Audios convertidos con exito, actualice la tabla");
        }
    }

    public static void sacarTextoArchivos(String rutaArchivo) throws FileNotFoundException, IOException {

        if (rutaArchivo.contains(".txt") || rutaArchivo.contains(".dat")) {
            String cadena;

            FileReader f = new FileReader(rutaArchivo);

            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                textoArchivo = textoArchivo + " " + cadena;
            }
            b.close();

        } else {
            if (rutaArchivo.substring(rutaArchivo.lastIndexOf(".") + 1).equals("doc")) {

                try {
                    File archivodoc = new File(rutaArchivo);
                    FileInputStream fileinputstream = new FileInputStream(archivodoc);
                    InputStream entradaArch = fileinputstream;
                    WordExtractor we = new WordExtractor(entradaArch);
                    String textoWordDOC = we.getText();
                    textoArchivo = textoWordDOC;
                } catch (Exception e) {
                }

            } else {
                try {
                    if (rutaArchivo.substring(rutaArchivo.lastIndexOf(".") + 1).equals("docx")) {

                        String men = leerDocx(rutaArchivo);
                        textoArchivo = men;
                    }
                } catch (Exception e) {
                }
            }
        }

    }

    public static String leerDocx(String rutaArchivo) {
        String mensaje = new String();
        try {
            FileInputStream fis = new FileInputStream(rutaArchivo);
            XWPFDocument docx = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphList = docx.getParagraphs();

            for (XWPFParagraph paragraph : paragraphList) {
                System.out.println(paragraph.getText());
                mensaje = mensaje + paragraph.getText();
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {

        }
        return mensaje;
    }

}
