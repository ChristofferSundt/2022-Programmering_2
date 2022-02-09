package Oppgave2;

public class Planet extends SpaceBody {

    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }
    public double calculateNewRadius() { return radius*71492;}
    public double calculateNewMass() { return mass*1.898E27;}

    public double getSurfaceGravity() {
        return (6.67408E-11*calculateNewMass())/(calculateNewRadius()*1000*calculateNewRadius()*1000);
    }

}

