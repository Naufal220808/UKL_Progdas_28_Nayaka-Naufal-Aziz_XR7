import java.util.Scanner;
import java.util.Random;
public class Uklsedang3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println(" ==== Selamat datang di kuis MATEMATIKA! ==== ");
        System.out.println("Kuis ini mencakup: perkalian, pembagian, dan modulus.");
        System.out.println("Kerjakan Soal Berikut!");

        boolean lanjutKuis = true;

        while (lanjutKuis) {
            double angka1 = r.nextInt(10) + 1;
            double angka2 = r.nextInt(10) + 1;

            int operasi = r.nextInt(3);
            double hasil = 0;
            String simbolOperasi = "";

            if (operasi == 0) {
                simbolOperasi = " * ";
                hasil = angka1 * angka2;
            } else if (operasi == 1 ) {
                simbolOperasi = " / ";
                hasil = (double) angka1 / angka2;
            } else {
                simbolOperasi = " % ";
                hasil = angka1 % angka2;
            }

            System.out.println("Berapa hasil dari: " + angka1 + simbolOperasi + angka2 + " = ");
            double jawUser = s.nextDouble();

            if (jawUser == hasil) {
                System.out.println("Hore Benar! Jawabanmu tepat.");

            } else if (Math.abs(jawUser - hasil) < 0.0001) { // selisih kecil
                System.out.println("Hore Benar! Jawabanmu tepat. Tetapi lebih tepatnya lagi adalah: " + hasil);

            } else {
                System.out.println("Yah Kamu Salah! Jawaban yang benar adalah: " + hasil);
            }

            System.out.println("Apakah anda ingin menlanjutkan kuis? (ya/gak): ");
            String lanjut = s.next().toLowerCase();

            if (lanjut.equals("gak")) {
                lanjutKuis = false;
                System.out.println("Terima kasih telah bermain!");
            }

        }

        s.close();
    }
    
}
