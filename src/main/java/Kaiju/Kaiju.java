package Kaiju;

import Interfaces.IAttack;
import Interfaces.IDamage;
import Vehicles.Vehicle;

public abstract class Kaiju implements IAttack, IDamage {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attachValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attachValue;
    }

//    abstract method, all child classes must have a roar method also
    public abstract String roar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void attack(Vehicle vehicle){

    }

}
