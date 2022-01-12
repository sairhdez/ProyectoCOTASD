package controlador;

import modelo.Audio;
import java.util.ArrayList;

public class ConvertirHilo implements Runnable {
 
    private ArrayList<Audio> arrayListAudio;
    private int comienzo;
    private int finalRun;
 
    public ConvertirHilo(ArrayList<Audio> arrayListAudio, int comienzo, int finalRun) {
        this.arrayListAudio = arrayListAudio;
        this.comienzo = comienzo;
        this.finalRun = finalRun;
    }
 
    public void run() {
        for (int i = comienzo; i < finalRun; i++) {            
            ConvertirAudio.nuevoAudio(ConvertirAudio.audio.get(i).getNombre(), ConvertirAudio.audio.get(i).getContenido());
            System.out.println(
                    String.format("Concurrete hilo %s printing value %s", Thread.currentThread().getName(), arrayListAudio.get(i).getNombre()));
        }
    }
}