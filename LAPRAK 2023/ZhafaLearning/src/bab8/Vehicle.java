package LATIHAN3;

public abstract class Vehicle {
    // buat variabel nama, tahun, dan rpm     protected String name;    
    protected int year;
    protected double rpm;

    // buat sebuah method abstrak yang nantinya akan di override oleh class Car    
    public Vehicle(String name, int year, double rpm) {
        this.name = name;
        this.year = year;
        this.rpm = rpm;
    }
    public abstract void drive();
}