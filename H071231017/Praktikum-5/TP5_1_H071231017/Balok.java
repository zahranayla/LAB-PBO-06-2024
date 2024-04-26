package TP5_1_H071231017;

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
