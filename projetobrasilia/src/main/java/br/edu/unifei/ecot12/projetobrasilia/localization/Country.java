package br.edu.unifei.ecot12.projetobrasilia.localization;

import java.util.ArrayList;
import java.util.List;

public class Country extends Locality {

    private String continent, coin;
    private List<State> states = new ArrayList<>();
    private Capital capital;

    
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
    }
    public List<State> getStates() {
        return states;
    }
    public void setStates(List<State> states) {
        this.states = states;
    }
    public Capital getCapital() {
        return capital;
    }
    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    


    
}
