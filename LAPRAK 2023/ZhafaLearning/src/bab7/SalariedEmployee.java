package bab7;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, double salary, int tanggal, int bulan, int tahun) { // tambahkan
                                                                                                           // int
                                                                                                           // tanggal,
                                                                                                           // int bulan,
                                                                                                           // int tahun
                                                                                                           // //jawaban
                                                                                                           // no 4
        super(name, noKTP, tanggal, bulan, tahun); // tambahkan tanggal, bulan, tahun //jawaban no 4
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried  employee:  " + super.toString() + "\nweekly salary: " + getWeeklySalary());
    }
}