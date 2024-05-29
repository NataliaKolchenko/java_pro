package org.example.Practice.ExtraTask;

public class Manager extends Employee{
    private int subordinatesCount;

    public Manager(String name, String position, double salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public String toString() {
        return "Manager:" +
                "name='" + getName() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                ", subordinatesCount=" + subordinatesCount
                ;
    }

//    Переопределение метода calculateBonus(), где бонус увеличивается на 2% за каждого подчиненного.
    @Override
    public double getCalculateBonus() {
        double managerRate = 0.02;
        return getSalary() * managerRate * subordinatesCount;
    }

    public int getSubordinatesCount() {
        return subordinatesCount;
    }
}
