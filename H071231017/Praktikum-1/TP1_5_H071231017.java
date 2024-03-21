
import java.util.Scanner;

public class Tp1_Numb5 {
    public static void main(String[] args) {
        // Array dua dimensi
        int[][] angka = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
        
        // Scanner untuk masukan pengguna
        Scanner scan = new Scanner(System.in);

        try {
            // Minta pengguna memasukkan angka
            System.out.print("Masukkan angka yang ingin dicari: ");
            int masukanAngka = scan.nextInt();
            
            // Iterasi melalui array untuk mencari angka yang dimasukkan pengguna
            for (int i = 0; i < angka.length; i++) {
                for (int j = 0; j < angka[i].length; j++) {
                    int angkaSaatIni = angka[i][j];
                    if (angkaSaatIni == masukanAngka) {
                        // Jika angka ditemukan, cetak posisinya
                        System.out.println("Angka " + masukanAngka + " ditemukan di [" + i + "][" + j + "]");
                    }
                }
            }
        } catch (Exception e) {
            // Tangani pengecualian (misalnya, jika pengguna memasukkan masukan yang bukan angka)
            System.out.println("Silakan masukkan angka yang ada dalam array dua dimensi.");
        } finally {
            // Tutup pemindai
            scan.close();
        }
    }
}
