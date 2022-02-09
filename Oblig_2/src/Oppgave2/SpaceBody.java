package Oppgave2;

public abstract class SpaceBody {

    protected String name;
    protected double radius;
    protected double mass;

    public SpaceBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }



    @Override
    public String toString(){
        return "Name:" + name + " radius:" + radius + " mass:" + mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public abstract double calculateNewMass();
    public abstract double calculateNewRadius();

}
