package e31252104_NadyaSyafiraRustamaji;

/*
Nama : Nadya Syafira Rustamaji
NIM  : E31252104
Tugas : Polymorphism dengan Method Overriding
*/

public class Main {

    public static void main(String[] args) {

        BangunDatar bd;

        bd = new Persegi(5);
        System.out.println("=== Persegi ===");
        System.out.println("Sisi : 5");
        System.out.println("Luas : " + bd.luas());
        System.out.println("Keliling : " + bd.keliling());

        bd = new Lingkaran(7);
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Jari-jari : 7");
        System.out.println("Luas : " + bd.luas());
        System.out.println("Keliling : " + bd.keliling());

        bd = new Segitiga(6, 8);
        System.out.println("\n=== Segitiga ===");
        System.out.println("Alas : 6");
        System.out.println("Tinggi : 8");
        System.out.println("Luas : " + bd.luas());
        System.out.println("Keliling : " + bd.keliling());
    }
}