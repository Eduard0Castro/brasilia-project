package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;
import java.util.List;
import java.util.ArrayList;

public class UrbanPlanner extends Designer{

    private List<String> referenceCities = new ArrayList<>();

    public List<String> getReferenceCities() {
        return referenceCities;
    }

    public void setReferenceCities(List<String> referenceCities) {
        this.referenceCities = referenceCities;
    }
}
