package TP5_1_H071231017;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. Lingkaran");
        System.out.println("6. Persegi");
        System.out.println("7. Persegi Panjang");
        System.out.println("8. Trapesium");
        System.out.println("----------------------------------------------");

        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        System.out.println("----------------------------------------------");

        switch (pilihan) {
            case 1:
                // Menghitung volume kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                BangunRuang kubus = new Kubus(sisiKubus);
                System.out.println("Volume Kubus: " + kubus.hitungVolume());
                System.out.println("----------------------------------------------");
                break;
            case 2:
                // Menghitung volume balok
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                BangunRuang balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Volume Balok: " + balok.hitungVolume());
                System.out.println("----------------------------------------------");
                break;
            case 3:
                // Menghitung volume bola
                System.out.print("Masukkan jari-jari bola: ");
                double jariJariBola = scanner.nextDouble();
                BangunRuang bola = new Bola(jariJariBola);
                System.out.println("Volume Bola: " + bola.hitungVolume());
                System.out.println("----------------------------------------------");
                break;
            case 4:
                // Menghitung volume tabung
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                BangunRuang tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Volume Tabung: " + tabung.hitungVolume());
                System.out.println("----------------------------------------------");
                break;
            case 5:
                // Menghitung luas dan keliling lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                BangunDatar lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
                System.out.println("----------------------------------------------");
                break;
            case 6:
                // Menghitung luas dan keliling persegi
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                BangunDatar persegi = new Persegi(sisiPersegi);
                System.out.println("Luas Persegi: " + persegi.hitungLuas());
                System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
                System.out.println("----------------------------------------------");
                break;
            case 7:
                // Menghitung luas dan keliling persegi panjang
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                BangunDatar persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
                System.out.println("----------------------------------------------");
                break;
            case 8:
                // Menghitung luas dan keliling trapesium
                System.out.print("Masukkan panjang sisi 1 trapesium: ");
                double sisi1 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 2 trapesium: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 3 trapesium: ");
                double sisi3 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi 4 trapesium: ");
                double sisi4 = scanner.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = scanner.nextDouble();
                BangunDatar trapesium = new Trapesium(sisi1, sisi2, sisi3, sisi4, tinggiTrapesium);
                System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
                System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
                System.out.println("----------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
