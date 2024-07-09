package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public class Order {

    private Ideology ideology;
    private Regime regime;

    public FederalGnmt buildFederal(){
        FederalGnmt federal = new FederalGnmt(regime);
        ideology.buildPParty(federal);

        return federal;

    }

    public Ideology getIdeology() {
        return ideology;
    }

    public void setIdeology(Ideology ideology) {
        this.ideology = ideology;
    }

    public Regime getRegime() {
        return regime;
    }

    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    
    
}
