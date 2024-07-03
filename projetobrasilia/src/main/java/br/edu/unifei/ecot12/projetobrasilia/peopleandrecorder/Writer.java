package br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder;
import java.util.List;
import java.util.ArrayList;

public class Writer extends Artist{
    private String literarySchool;
    private List<String> famousPoems = new ArrayList<>();

    protected Writer(){}

    public String getLiterarySchool() {
        return literarySchool;
    }
    public void setLiterarySchool(String literarySchool) {
        this.literarySchool = literarySchool;
    }
    public List<String> getFamousPoems() {
        return famousPoems;
    }
    public void setFamousPoems(List<String> famousPoems) {
        this.famousPoems = famousPoems;
    }

    public void artisticize(String theme){
        System.out.print("Poem theme: ");
        System.out.println(theme);
    }
    
}
