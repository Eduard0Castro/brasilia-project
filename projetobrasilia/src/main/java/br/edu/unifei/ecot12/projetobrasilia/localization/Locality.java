package br.edu.unifei.ecot12.projetobrasilia.localization;
import br.edu.unifei.ecot12.projetobrasilia.politicalcontext.BrazilGovernment;

public abstract class Locality {

    private String name;
    private BrazilGovernment gnmt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrazilGovernment getGnmt() {
        return gnmt;
    }

    public void setGnmt(BrazilGovernment gnmt) {
        this.gnmt = gnmt;
    }

}
