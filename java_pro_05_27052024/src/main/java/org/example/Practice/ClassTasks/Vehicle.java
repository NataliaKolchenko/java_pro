

package org.example.Practice.ClassTasks;

public class Vehicle {
    private String nameVehicle;
    private int speed;

    public Vehicle(String nameVehicle, int speed) {
        this.nameVehicle = nameVehicle;
        this.speed = speed;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameVehicle='" + nameVehicle + '\'' +
                ", speed=" + speed +
                '}';
    }
}
