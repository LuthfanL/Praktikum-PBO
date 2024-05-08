/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : TestSenjata.java
 * Deskripsi	: File main dari objek Senjata dan KontrolSenjata
 */

package latihanMedium;

public class TestSenjata {
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        kontrolAK47.sisaPeluru();

        System.out.println("==========================");

        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
        kontrolm16.sisaPeluru();
    }
}
