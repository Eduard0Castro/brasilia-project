package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.President;

public class Republic extends Regime{

    private int electionYear;
    private President president;

    public Republic (President president){
        this.president = president;
    }

    public String execute(){
        return "Division off power!";
    }

    public int getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(int electionYear) {
        this.electionYear = electionYear;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    

    
}
