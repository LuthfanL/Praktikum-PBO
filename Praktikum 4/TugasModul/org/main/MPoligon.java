/*
 * File : MPoligon.java
 * Penulis : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Deskripsi : driver class untuk poligon, persegi panjang dan segitiga
 */

package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(6, 8, 3);
        segitiga.printInfoSegitiga();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuasSegitiga());
    }
}
