/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * Tanggal : 20 Maret 2024
 * File : MBujurSangkar.java
 * Deskripsi : kelas yang mengimplementasikan cara menghitung
 *             luas bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah "+bs.hitungLuas(sisi));

    }
}
