package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public class FederalGnmt extends BrazilGovernment {

    private String headOfQuarters;

    public FederalGnmt(Regime regime){
        super(regime);
    }

    public void toRule(){
        System.out.println(getRegime().execute());
        System.out.println("Ruling the country!");
    }

    public String getHeadOfQuarters() {
        return headOfQuarters;
    }

    public void setHeadOfQuarters(String headOfQuarters) {
        this.headOfQuarters = headOfQuarters;
    }

    
}
