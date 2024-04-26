package TP5_1_H071231017;

class Persegi extends BangunDatar {
        private double sisi;
    
        public Persegi(double sisi) {
            this.sisi = sisi;
        }
    
        @Override
        public double hitungLuas() {
            return Math.pow(sisi, 2);
        }
    
        @Override
        public double hitungKeliling() {
            return 4 * sisi;
        }
    }