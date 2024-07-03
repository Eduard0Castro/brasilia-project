package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;

public class LyricSector implements Recorder<Writer>{

    public Writer buildArtist(){
        return new Writer();
    }
    
}
