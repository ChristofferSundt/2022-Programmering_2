package Oppgave2;

public class Main {
    public static void main(String[] args) {

        Star star = new Star("Sun", 1.0, 1.0, 5777);
        PlanetSystem planetSystem = new PlanetSystem("Solar system", star,
                new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4),
                new Planet("Venus", 0.08465003077267387, 0.002564278187565859),
                new Planet("Earth", 0.08911486599899289, 0.003146469968387777),
                new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4),
                new Planet("Jupiter", 1.0, 1.0),
                new Planet("Saturn", 0.8145247020645666, 0.2994204425711275),
                new Planet("Uranus", 0.35475297935433336, 0.04573761854583773),
                new Planet("Neptune", 0.34440217087226543, 0.05395152792413066));

        System.out.println(planetSystem.getCenterStar() + "\n");

        for (Planet planet : planetSystem.getPlanets()){
            System.out.println(planet);
        }


        System.out.println("\n" + planetSystem.getPlanets().get(5).calculateNewMass() + " " + planetSystem.getPlanets().get(5).calculateNewRadius());

        System.out.println("\n" + planetSystem.getCenterStar().calculateNewMass() + " " + planetSystem.getCenterStar().calculateNewRadius());

        System.out.println("\n" + planetSystem.getPlanets().get(7).getSurfaceGravity());



    }
}
