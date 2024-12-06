import java.util.Scanner;

public class uKlsulit3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // input jumlah elemen oleh user
        System.out.println("Masukkan jumlah elemen array:");
        int n = s.nextInt();
        int[] array = new int[n];

        // input user
        System.out.println("Masukkan " + n + " elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        // manggil fungsi utk mnghitung dan menampilkan elemen
        hitungFrekuensi(array, n);

        s.close();
    }

    // function
    public static void hitungFrekuensi(int[] array, int n) {
        System.out.println("\nHasil frekuensi elemen:");
        for (int i = 0; i < n; i++) {
            // cek apa sdh dihitung sblmnya
            boolean sudahDihitung = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true;
                    break;
                }
            }

            // jika belum
            if (!sudahDihitung) {
                int frekuensi = 1;
                for (int k = i + 1; k < n; k++) {
                    if (array[i] == array[k]) {
                        frekuensi++;
                    }
                }
                System.out.println("Elemen " + array[i] + " muncul " + frekuensi + " kali");
            }
        }
    }
}

