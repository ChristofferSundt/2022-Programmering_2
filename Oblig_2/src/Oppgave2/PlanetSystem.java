package Oppgave2;

import java.util.Arrays;
import java.util.List;

public class PlanetSystem {

    private String name;
    private Star centerStar;
    private List<Planet> planets;

    public PlanetSystem(String name, Star centerStar, Planet... planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = Arrays.asList(planets);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
}
