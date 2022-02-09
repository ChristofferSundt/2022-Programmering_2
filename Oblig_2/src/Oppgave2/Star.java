package Oppgave2;

public class Star extends SpaceBody{

    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp){
        super(name, radius, mass);

        this.effectiveTemp = effectiveTemp;
    }



    @Override
    public String toString(){
        return super.toString() + " effective temperature:" + effectiveTemp;
    }

    @Override
    public double calculateNewMass() {
        return mass*1.98892E30;
    }

    @Override
    public double calculateNewRadius() {
        return radius*695700 ;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp( double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
