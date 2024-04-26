package TP5_2_H071231017;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Smartphone myPhone = new Smartphone("Samsung", 123456, 899.99, 6.5, 256);
    Laptop myLaptop = new Laptop("Dell", 987654, 1299.99, "intel core i7", 16);
    Camera myCamera = new Camera("Canon", 456789, 699.99, 24, "Telephoto");

    ArrayList<Product> productList = new ArrayList<>();
    productList.add(myPhone);
    productList.add(myLaptop);
    productList.add(myCamera);


    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Tambah Produk");
      System.out.println("2. Tampilkan Semua Produk");
      System.out.println("3. Beli Produk");
      System.out.println("4. Keluar\n");
      System.out.print(">>> Pilih menu (1-4):  ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Masukkan nama produk: ");
          String name = scanner.nextLine();
          System.out.print("Masukkan nomor seri: ");
          int serialNumber = scanner.nextInt();
          System.out.print("Masukkan harga: ");
          double price = scanner.nextDouble();
          scanner.nextLine();

          System.out.println("Pilih tipe produk:");
          System.out.println("1. Smartphone");
          System.out.println("2. Laptop");
          System.out.println("3. Camera");
          System.out.print("Pilih tipe produk (1-3): ");
          int productType = scanner.nextInt();
          scanner.nextLine();

          switch (productType) {
            case 1:
              System.out.print("Masukkan ukuran layar (inci): ");
              double screenSize = scanner.nextDouble();
              System.out.print("Masukkan kapasitas penyimpanan (GB): ");
              int storageCapacity = scanner.nextInt();
              productList.add(new Smartphone(name, serialNumber, price, screenSize, storageCapacity));
              break;
            case 2:
              System.out.print("Masukkan tipe prosesor: ");
              String processorType = scanner.nextLine();
              System.out.print("Masukkan ukuran RAM (GB): ");
              int ramSize = scanner.nextInt();
              productList.add(new Laptop(name, serialNumber, price, processorType, ramSize));
              break;
            case 3:
              System.out.print("Masukkan resolusi (MP): ");
              int resolution = scanner.nextInt();
              scanner.nextLine();
              System.out.print("Masukkan jenis lensa: ");
              String lensType = scanner.nextLine();
              productList.add(new Camera(name, serialNumber, price, resolution, lensType));
              break;
            default:
              System.out.println("Pilihan tidak valid.");
          }
          break;
        case 2:
          System.out.println("Daftar Produk:");
          for (Product product : productList) {
            product.displayInfo();
            System.out.println();
          }
          break;
        case 3:
          System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
          int buySerialNumber = scanner.nextInt();
          scanner.nextLine();
          boolean found = false;  // utk melacak apkh produk dgn nomor seri itu ada or tdk
          for (Product product : productList) {  //iterasi melalui setiao  obj prodk dlm product list
            if (product.serialNumber == buySerialNumber) {
              System.out.println("Anda telah membeli produk:");
              product.displayInfo();
              found = true;
              break;
            }
          }
          if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
          }
          break;
        case 4:
          System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
          System.exit(0);
        default:
          System.out.println("Pilihan tidak valid.");
      }
    }
  }
}
