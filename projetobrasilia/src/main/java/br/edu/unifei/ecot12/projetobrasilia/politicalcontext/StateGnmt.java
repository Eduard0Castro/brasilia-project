package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public class StateGnmt extends BrazilGovernment{

    private String governorName;

    public StateGnmt(Regime regime){
        super(regime);
    }

    public void toRule(){
        System.out.println(getRegime().execute());
        System.out.println("Ruling the state");
    }

    public String getGovernorName() {
        return governorName;
    }

    public void setGovernorName(String governorName) {
        this.governorName = governorName;
    }

    
    
}
