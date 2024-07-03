package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;

public class InstrumentalSector implements Recorder<Composer>{

    public Composer buildArtist(){
        return new Composer();
    }
    
}
