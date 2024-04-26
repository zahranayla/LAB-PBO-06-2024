package TP5_1_H071231017;

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}
