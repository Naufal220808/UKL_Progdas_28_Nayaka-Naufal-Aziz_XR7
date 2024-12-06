import java.util.Scanner;

public class uklsedang1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // input blgngan
        System.out.println("Masukkan bilangan bulat positif: ");
        double num = s.nextDouble();
        
        // validasi
        if (num < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= num; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + num + " adalah: " + faktorial);
        }
        
        s.close();
    }
}

