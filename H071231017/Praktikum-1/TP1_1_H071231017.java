import java.util.Scanner;

public class Tp1_Numb1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //utk menerima inputan dri user

        int n = scanner.nextInt();       //jumlah angka yg akan dimasukkan
        int bilanganBulat = 0;
        int bilanganDesimal = 0;        //utk menyimpan jummlah blngn

        for (int i = 0; i < n; i++) {      //utk membaca input user sebnyak n kali
            try {
                double bilangan = scanner.nextDouble();
                if (bilangan % 1 == 0) {
                    bilanganBulat++;
                } else {
                    bilanganDesimal++;
                }
            } catch (NumberFormatException e) {         //jika user input sesuatu yg bkn angka 
                System.out.println("Input bukan angka!");
            }
        }

        System.out.println(bilanganBulat + " Bilangan Bulat");
        System.out.println(bilanganDesimal + " Bilangan Desimal");
    }
}
