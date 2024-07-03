package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public abstract class BrazilGovernment {
    private int year;
    private String slogan;
    private Regime regime;
    private PoliticalParty politicalParty;

    public abstract void toRule();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Regime getRegime() {
        return regime;
    }

    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    public PoliticalParty getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(PoliticalParty politicalParty) {
        this.politicalParty = politicalParty;
    }

    
}
