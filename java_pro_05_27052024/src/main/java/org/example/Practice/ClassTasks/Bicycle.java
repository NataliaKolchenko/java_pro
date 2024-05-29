package org.example.Practice.ClassTasks;

public class Bicycle  extends Vehicle {
    private String bicycleType;

    public Bicycle(String nameVehicle, int speed, String bicycleType) {
        super(nameVehicle, speed);
        this.bicycleType = bicycleType;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "bicycleType='" + bicycleType + '\'' +
                '}';
    }
}
