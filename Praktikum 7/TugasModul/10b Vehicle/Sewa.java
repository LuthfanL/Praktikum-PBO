/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : Sewa.java
 */

public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
