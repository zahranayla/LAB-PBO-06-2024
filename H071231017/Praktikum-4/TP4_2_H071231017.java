class Mobile {
    private String merk;
    private String model;
    private double harga;
    private int tahunProduksi;
    private String deskripsi;

    public Mobile(String merk, String model, double
     harga, int tahunProduksi, String deskripsi) {
        this.merk=merk;
        this.model=model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;


    }
    public Mobile(){

    }

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getTahunproduksi() {
        return tahunProduksi;
    }
    public void setTahunproduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Deskripsi: " + deskripsi);

    }
}
public class TP4_2_H071231017 {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();

        mobile1.setMerk("Pajero");
        mobile1.setModel("sport");
        mobile1.setHarga(300000000);
        mobile1.setTahunproduksi(2021);
        mobile1.setDeskripsi("mobil");

        mobile1.displayInfo();

        Mobile mobile2 = new Mobile("minicooper", "Family man", 25000,2020,"dreamcar");


        System.out.println(mobile2.getMerk());
        System.out.println(mobile2.getModel());
        System.out.println(mobile2.getHarga());
        System.out.println(mobile2.getTahunproduksi());
        System.out.println(mobile2.getDeskripsi());

        SelfUtils.displaySelfData();


    }
}
class SelfUtils {
    public static void displaySelfData() {
        System.out.println("Nama: Nayla Zahra Adelia");
        System.out.println("NIM: H071231017");
    }
}


