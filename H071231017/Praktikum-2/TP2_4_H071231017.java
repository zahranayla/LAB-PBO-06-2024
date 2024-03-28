class Alamat {
    String jalan;
    String kota;

    public String getJalan() {    //method setter utk mengambil dan mengatur nilai atribut
        return jalan;
    }

    public String getKota() {
        return kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }


    public String getNim() {
        return nim;
    }



    public Alamat getAlamat() {
        return alamat;
    }


}

public class TP2_4_H071231017 {

    public static void main(String[] args) {
        Alamat alamat = new Alamat();   //objek dibuat dan diinisialisasi dgn nilai" tertentu
        alamat.jalan = "Urip";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Nayla";
        mahasiswa.nim = "H0712231017";
        mahasiswa.alamat = alamat;

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getJalan() + ", " + mahasiswa.getAlamat().getKota());
    }
}

