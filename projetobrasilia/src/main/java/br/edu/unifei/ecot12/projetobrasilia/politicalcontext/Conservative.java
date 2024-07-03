package br.edu.unifei.ecot12.projetobrasilia.politicalcontext;

public class Conservative implements Ideology{

    public void buildPParty(FederalGnmt fdr){
        fdr.setPoliticalParty(new PoliticalParty());
        fdr.getPoliticalParty().setIdeals("Conservatives");
    }
    
}
