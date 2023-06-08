package bab5;

public class Manager1 extends Employee {
    private double bonus;

    // jawaban no 2
    public Manager1(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day); // jaaban no 4, penambahan variabel bonus mengakibatkan terjadinya error
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        // jawaban no 5
        // bonus = bonus; akan mengakibatkan variabel bonus akan merujuk pada dirinya
        // sendiri
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}