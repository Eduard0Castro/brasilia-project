package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;

public class President extends Political{

    private int years;
    private static President president = new President();

    private President(){}

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public static President getPresident() {
        return president;
    }

    
}
