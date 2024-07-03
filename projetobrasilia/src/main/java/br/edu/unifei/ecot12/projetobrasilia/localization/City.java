package br.edu.unifei.ecot12.projetobrasilia.localization;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.Architech;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.Engineer;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.UrbanPlanner;

public class City extends Locality {

    private int foundedIn;
    private int population;
    private Architech architech;
    private UrbanPlanner urbanPlanner;
    private Engineer engineer;


    public Architech getArchitech() {
        return architech;
    }
    public void setArchitech(Architech architech) {
        this.architech = architech;
    }
    public UrbanPlanner getUrbanPlanner() {
        return urbanPlanner;
    }
    public void setUrbanPlanner(UrbanPlanner urbanPlanner) {
        this.urbanPlanner = urbanPlanner;
    }
    public Engineer getEngineer() {
        return engineer;
    }
    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }
    public int getFoundedIn() {
        return foundedIn;
    }
    public void setFoundedIn(int foundedIn) {
        this.foundedIn = foundedIn;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    


}
