package bab5;

import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireday = calendar.getTime();
    }

    // jawaban no 3
    // public Employee(String name){
    // this.name = name;
    // this.salary = 0;
    // this.hireday = new Date();
    // }
    // jawaban no 6
    // public Employee(String name){
    // this.name = name;
    // }
    public Date getHireDay() { // jwaban no 8 access modifier method diganti private, maka MainEmployee tidak
                               // dapat mengakses method tersebut, sementara jika diganti protected, output
                               // akan tetap bisa dihasilkan
        return hireday;
    }

    public String getName() { // jwaban no 8 access modifier method diganti private, maka MainEmployee tidak
                              // dapat mengakses method tersebut, sementara jika diganti protected, output
                              // akan tetap bisa dihasilkan
        return name;
    }

    public double getSalary() { // jwaban no 8 access modifier method diganti private, maka MainEmployee tidak
                                // dapat mengakses method tersebut, sementara jika diganti protected, output
                                // akan tetap bisa dihasilkan
        return salary;
    }

    public void raiseSalary(double byPercent) { // jwaban no 8 access modifier method diganti private, maka MainEmployee
                                                // tidak dapat mengakses method tersebut, sementara jika diganti
                                                // protected, output akan tetap bisa dihasilkan
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}