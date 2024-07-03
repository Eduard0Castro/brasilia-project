package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;

public class Composer extends Artist{

    private String firstInstrument;
    private int composerDayHours;

    protected Composer(){}

    public String getFirstInstrument() {
        return firstInstrument;
    }

    public void setFirstInstrument(String firstInstrument) {
        this.firstInstrument = firstInstrument;
    }

    public int getComposerDayHours() {
        return composerDayHours;
    }

    public void setComposerDayHours(int composerDayHours) {
        this.composerDayHours = composerDayHours;
    }

    public void artisticize(String theme){
        System.out.print("Composition theme: ");
        System.out.println(theme);
    }
    
}
