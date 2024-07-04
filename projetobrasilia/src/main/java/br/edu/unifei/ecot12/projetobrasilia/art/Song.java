package br.edu.unifei.ecot12.projetobrasilia.art;
import java.util.List;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Song extends MusicalWork{

    private List<String> instruments = new ArrayList<>();
    private boolean hasSinger;
    private String songPath;

    public List<String> getInstruments() {
        return instruments;
    }
    public void setInstruments(List<String> instruments) {
        this.instruments = instruments;
    }
    public boolean itHasSinger() {
        return hasSinger;
    }
    public void setHasSinger(boolean hasSinger) {
        this.hasSinger = hasSinger;
    }
    public String getSongPath() {
        return songPath;
    }
    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    protected void play(){
        try {
            // Obtendo o arquivo de som
            File arquivoSom = new File(this.songPath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);

            // Obter o formato de áudio do stream de entrada
            AudioFormat formatoAudio = audioStream.getFormat();

            // Obter uma linha do sistema de áudio para reproduzir o som
            DataLine.Info info = new DataLine.Info(Clip.class, formatoAudio);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrir o clip e carregar o áudio
            clip.open(audioStream);

            // Iniciar a reprodução
            clip.start();

            // Manter a execução enquanto o som está sendo reproduzido
            System.out.println("Song being played");
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Fechar recursos
            clip.close();
            audioStream.close();

            System.out.println("Concluded");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("File format does not supported");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error to access the file");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Audio line does not avaible");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Thread stoped");
            e.printStackTrace();
        }
    }
    
    
}
