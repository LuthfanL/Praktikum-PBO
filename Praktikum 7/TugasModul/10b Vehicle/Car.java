/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : Car.java
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
