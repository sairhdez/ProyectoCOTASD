package controlador;

import java.io.IOException;

public class DescargaHilo extends Thread{
    public String rutaAudio;
    
    public void run(){      
        try {
            ConvertirAudio.gestionAgregarAudio(rutaAudio);
        } catch (IOException ex) {
            
        }
    }    
}
