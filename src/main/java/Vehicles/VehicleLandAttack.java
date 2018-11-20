package Vehicles;

public class VehicleLandAttack extends Vehicle {

    public VehicleLandAttack(String type, int healthValue, int attackValue){
        super(type, healthValue, attackValue);
    }

    public String move() {
        return this.getType() + " is moving!";
    }

}
