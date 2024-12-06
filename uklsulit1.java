import java.util.Scanner;

public class uklsulit1 {
    public static void main(String[] args) {
        double ratarata=0;
        int jmlSiswa, nilaiProduktif, seluruhNilai= 0;

        Scanner q = new Scanner(System.in);
        System.out.println(" ==== REKAPITULASI NILAI PRODUKTIF RPL==== ");
        System.out.println("  ");
        System.out.println("Masukkan Jumlah Siswa: ");
        jmlSiswa = q.nextInt();
        for (int i = 1; i <= jmlSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" +i +": ");
            nilaiProduktif = q.nextInt();
            seluruhNilai = seluruhNilai + nilaiProduktif;
        }

        ratarata = (double)seluruhNilai/jmlSiswa;
        System.out.println("\n==== HASIL REKAPITULASI ====");
        System.out.println("  ");
        System.out.println("Total Nilai Produktif = "+ seluruhNilai);
        System.out.println("Rata rata Nilai Produktif = "+ratarata);
        q.close();
}
}
