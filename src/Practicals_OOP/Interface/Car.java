package Practicals_OOP.Interface;

public class Car implements Vehicle {
    public int speed= 0, gear =1 ;
    boolean areBrakesApplied  = false;
    @Override
    public void speedUp(int speedToAdd) {
        speed += speedToAdd;
        System.out.println("Car's Speed is increased by "+speedToAdd+"km/hr\n Now Speed is "+speed+"\n");
    }
    @Override
    public void applyBreaks() {
        areBrakesApplied = false;
        System.out.println("Car's Breaks are now applied \n areBrakesApplied property is "+areBrakesApplied+"\n");
    }
    @Override
    public void GearChange(int gno) {
        System.out.println("Car's gear was changed from "+gear+"to "+gno+"\n");
        gear= gno;
    }
}
