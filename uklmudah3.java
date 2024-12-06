public class uklmudah3 {
    public static void main(String[] args) {
        for (int nomor = 50; nomor >= 2; nomor--) {
            if (nomor % 3 == 0) {
                System.out.println(nomor + ". saya angkatan 33");
            } else if (nomor % 2 == 0) {
                System.out.println(nomor + ". saya anak moklet");
            } else {
                System.out.println(nomor + ". saya anak wikusama");
            }
        }
        System.out.println("1. saya senang");
    }
}
