package br.edu.unifei.ecot12.projetobrasilia.art;
import java.util.ArrayList;
import java.util.List;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.Writer;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.Composer;

public class Album extends MusicalWork{

    private int numOfTracks;
    private Writer writer;
    private Composer composer;
    private List<Song> songs = new ArrayList<>();

    public Album(Writer writer, Composer composer){

        this.writer = writer;
        this.composer = composer;

    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    public void setNumOfTracks(int numOfTracks) {
        this.numOfTracks = numOfTracks;
    }

    public Writer getWriter() {
        return writer;
    }


    public void setWriter(Writer writer) {
        this.writer = writer;
    }


    public Composer getComposer() {
        return composer;
    }


    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    
    
    public void playTrack(int trackNum){
        try {
            songs.get(trackNum).play();
        }

        catch(IndexOutOfBoundsException exception){
            System.out.println("Index ou of the range");
            exception.printStackTrace();

        }
    }
}
