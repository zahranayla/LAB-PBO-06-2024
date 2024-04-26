package TP5_1_H071231017;

class Lingkaran extends BangunDatar {
        private double jariJari;
    
        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }
    
        @Override
        public double hitungLuas() {
            return Math.PI * Math.pow(jariJari, 2);
        }
    
        @Override
        public double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }
    }
    