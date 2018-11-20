package Vehicles;

public class VehicleAirAttack extends Vehicle {


    public VehicleAirAttack(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
    }

    public String move() {
        return this.getType() + " is flying!";
    }

}
