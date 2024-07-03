package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;

public abstract class Artist extends Person{

    private String typeOfArt;

    public String getTypeOfArt() {
        return typeOfArt;
    }

    public void setTypeOfArt(String typeOfArt) {
        this.typeOfArt = typeOfArt;
    }

    public abstract void artisticize(String theme);

    
}
