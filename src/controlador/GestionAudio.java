package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;
import com.ibm.watson.text_to_speech.v1.model.Voices;
import com.ibm.watson.text_to_speech.v1.util.WaveUtils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GestionAudio {


    String API_KEY = "xP6-3U0hixthiZ-TJhgtYbSCcvhHNUwhOCLcslNSYNI8";
    String URL = "https://api.us-south.text-to-speech.watson.cloud.ibm.com/instances/9191d1f3-469a-4a01-a612-68dd940ec341";
    String rutacompleta;
    Clip clip;

    public void crearAudio(String nombreAudio, String textoAudio, String voz) {
        IamOptions options = new IamOptions.Builder().apiKey(API_KEY).build();

        TextToSpeech textTo = new TextToSpeech(options);
        textTo.setEndPoint(URL);

        try {
            SynthesizeOptions syntOptions = new SynthesizeOptions.Builder()
                    .text(textoAudio)
                    .accept("audio/wav")
                    .voice(voz)
                    .build();

            InputStream inputStream = textTo.synthesize(syntOptions).execute().getResult();
            InputStream InputS = WaveUtils.reWriteWaveHeader(inputStream);

            String filename = nombreAudio;
            rutacompleta = "audio/" + filename + ".wav";

            OutputStream outputstream = new FileOutputStream(rutacompleta);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = InputS.read(buffer)) > 0) {
                outputstream.write(buffer, 0, length);
            }

            outputstream.close();
            InputS.close();
            inputStream.close();

        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void reproducirAudio(String rutaAudio) {
        try {
            File file = new File(rutaAudio);

            clip = AudioSystem.getClip();
            AudioInputStream oStream = AudioSystem.getAudioInputStream(file);
            clip.open(oStream);
            clip.loop(0);

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {

        } finally {
            try {
                clip.flush();
            } catch (NullPointerException e) {
            }
        }
    }

    public void listaVoces() {
        IamOptions options = new IamOptions.Builder()
                .apiKey(API_KEY)
                .build();

        TextToSpeech textToSpeech = new TextToSpeech(options);
        textToSpeech.setEndPoint(URL);

        Voices vocesAudio = textToSpeech.listVoices().execute().getResult();
    }

}
