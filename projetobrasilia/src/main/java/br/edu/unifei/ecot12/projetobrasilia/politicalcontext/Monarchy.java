package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.Monarch;

public class Monarchy extends Regime{

    private String typology;
    private List<Monarch> monarchs = new ArrayList<>();

    public String execute(){
        return "Monarchs in power!";
    }

    public String getTypology() {
        return typology;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    public List<Monarch> getMonarchs() {
        return monarchs;
    }

    public void setMonarchs(List<Monarch> monarchs) {
        this.monarchs = monarchs;
    }
    
}
