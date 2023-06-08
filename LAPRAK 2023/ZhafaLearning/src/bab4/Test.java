package bab4;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi"); // terjadi error akibat dari no 3
        s1.setMark(90);
        // perbaikan no 1
        System.out.println("s1Name is " + s1.getName()); // jawaban no 2
        System.out.println("s1Mark is " + s1.getMark());
        System.out.println("name dan mark " + s1.getName() + " " + s1.getMark());
    }
}