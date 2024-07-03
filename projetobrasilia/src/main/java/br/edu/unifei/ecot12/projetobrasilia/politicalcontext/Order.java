package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public class Order {

    private Ideology ideology;

    public FederalGnmt buildFederal(){
        FederalGnmt federal = new FederalGnmt();
        ideology.buildPParty(federal);

        return federal;

    }

    public Ideology getIdeology() {
        return ideology;
    }

    public void setIdeology(Ideology ideology) {
        this.ideology = ideology;
    }

    
    
}
