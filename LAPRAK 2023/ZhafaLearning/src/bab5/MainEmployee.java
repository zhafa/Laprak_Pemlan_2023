package bab5;

public class MainEmployee {
    public static void main(String[] args) {
        Manager1 boss = new Manager1("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);
        System.out.println("nama boss : " + boss.getName() + ", salary = " + boss.getSalary());
        System.out.println("nama staff : " + staff.getName() + ", salary = " + staff.getSalary());
    }
}