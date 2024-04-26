package TP5_1_H071231017;

class Tabung extends BangunRuang {
    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}
