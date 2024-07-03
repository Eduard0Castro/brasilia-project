package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public abstract class Regime {

    private String headOfState;
    private int periodInForce;

    public abstract String execute();

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getPeriodInForce() {
        return periodInForce;
    }

    public void setPeriodInForce(int periodInForce) {
        this.periodInForce = periodInForce;
    }
    

    
}
