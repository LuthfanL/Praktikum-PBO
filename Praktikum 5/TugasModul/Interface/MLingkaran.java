/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 20 Maret 2024
 * File : MLingkaran.java
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari Lingkaran : ");
        double jejari=scan.nextDouble();
        Lingkaran l=new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungLuas());
    }
}
