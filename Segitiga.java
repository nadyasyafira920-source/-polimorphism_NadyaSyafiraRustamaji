package e31252104_NadyaSyafiraRustamaji;

public class Segitiga extends BangunDatar {

    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}