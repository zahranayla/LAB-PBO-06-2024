import java.util.Scanner;

class Product {
    private int id;    //atribut
    private String name;
    private int stock;
    private int price;

    // Constructor      yg digunkaan utk menginisialisasi objek produk dgn nilai2 tertentu
    public Product(int id, String name, int stock, int price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    // Getter methods   berfungsi utk mendapatkan nilai dri setiap atribut produk
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    // Method utk check if the product is available in stock  yg dmn nantinya akan mengembalikan true
    public boolean isAvailable() {
        return stock > 0;
    }
}

public class TP2_2_H071231017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Masukkan ID produk:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Masukkan nama produk:");
        String name = scanner.nextLine();
        System.out.println("Masukkan stok produk:");
        int stock = scanner.nextInt();
        System.out.println("Masukkan harga produk:");
        int price = scanner.nextInt();

        // Product objek
        Product product = new Product(id, name, stock, price);  //yg dibuat menggunakan nilai2 yg dimasukkan oleh user

        //  product details     yg nantinya utk menampilkan detail produk yg diinput oleh user
        System.out.println("\nDetail Produk:");
        System.out.println("ID: " + product.getId());
        System.out.println("Nama: " + product.getName());
        System.out.println("Stok: " + product.getStock());
        System.out.println("Harga: " + product.getPrice());

        // Check if product is available
        if (product.isAvailable()) {
            System.out.println("Produk tersedia.");
        } else {
            System.out.println("Produk habis.");
        }

        scanner.close();
    }
}
