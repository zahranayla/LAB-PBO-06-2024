package TP5_2_H071231017;

class Product {
  String brand;
  int serialNumber;
  double price;

  public Product(String brand, int serialNumber, double price) {
    this.brand = brand;
    this.serialNumber = serialNumber;
    this.price = price;
  }

  void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Serial Number: " + serialNumber);
    System.out.println("Price: $" + price);
  }
}
