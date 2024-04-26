package TP5_2_H071231017;

class Smartphone extends Product {
  double screenSize;
  int storageCapacity;

  public Smartphone(String brand, int serialNumber, double price, double screenSize, int storageCapacity) {
    super(brand, serialNumber, price);
    this.screenSize = screenSize;
    this.storageCapacity = storageCapacity;
  }

  void displayInfo() {
    super.displayInfo();
    System.out.println("Screen Size: " + screenSize + " inches");
    System.out.println("Storage Capacity: " + storageCapacity + "GB");
  }
}
