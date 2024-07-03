package br.edu.unifei.ecot12.projetobrasilia.art;

public abstract class MusicalWork {
    private String title;
    private float duration;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
}
