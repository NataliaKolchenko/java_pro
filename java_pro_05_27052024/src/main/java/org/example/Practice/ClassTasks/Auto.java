package org.example.Practice.ClassTasks;

public class Auto extends Vehicle {
    private String engineType;

    public Auto(String nameVehicle, int speed, String engineType) {
        super(nameVehicle, speed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
