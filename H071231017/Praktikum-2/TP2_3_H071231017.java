class Cuboid{
    double height;   //atribut
    double widht;
    double length;

    double getVolume(){  //utk mengembalikan  volume kuboid
      return height * widht * length;  
    }
}
public class TP2_3_H071231017 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.length = 30;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
