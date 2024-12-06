import java.util.Scanner;
public class Uklmudah2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Masukkan bilangan");
        double bil = p.nextDouble(); 
       
    
        if (bil % 2==0) {
            System.out.println(bil + ": Merupakan Bilangan Genap");
        } else {
            System.out.println(bil + ": Merupakan Bilangan Ganjil");
        }


            
        }
    }

