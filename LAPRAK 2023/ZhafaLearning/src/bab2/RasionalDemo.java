package bab2;

public class RasionalDemo {
    public class RasionalDemo {

        public static void main(String[] args){ 
        Rasional R1 = new Rasional(1,2); 
        Rasional R2 = new Rasional(1,3); 
        System.out.println("R1.isRasional: " + R1.isRasional()); System.out.println("R2.isRasional: " + R1.isRasional()); System.out.println(); 
        10 System.out.println("R1 > R2 : " + R1.moreThan(R2)); 11 System.out.println(); 
        13 System.out.print("R1 : "); 
        14 R1.cetak(); 
        15 System.out.print("R2 : "); 
        16 R2.cetak(); 
        System.out.println(); 
         
        R1.Sederhana(); 
        R2.Sederhana(); 
        System.out.print("R1 : "); 
        R1.cetak(); 
        System.out.print("R2 : "); 
        R2.cetak(); 
        System.out.println(); 
        System.out.println("Setelah dilakukan Cast ke double menjadi : " ); 
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast()); 
        System.out.println(); 
        R1.negasi(); 
        System.out.print("Unary- dari R1 : "); 
        R1.cetak(); 
        System.out.println(); 
        R1.unaryPlus(R2); 
        System.out.print("Nilai dari 'R1 += R2' : "); 
        R1.cetak(); 
        System.out.println(); 
        }
    }

}
