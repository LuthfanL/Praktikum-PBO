/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : LambdaMap.java
 * Deskripsi : Program untuk menampilkan key dan value dari sebuah Map yang berisi NIM dan nama mahasiswa menggunakan ekspresi lambda.
 */

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("111", "Luthfan");
        mahasiswaMap.put("222", "Naufal");
        mahasiswaMap.put("333", "Arga");
        mahasiswaMap.put("444", "Arya");
        mahasiswaMap.put("555", "David");
        mahasiswaMap.put("666", "Lazuardi");
        mahasiswaMap.put("777", "Ajisadda");
        mahasiswaMap.put("888", "Fikri");
        mahasiswaMap.put("998", "Sajid");
        mahasiswaMap.put("999", "Ayyub");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM : " + nim + ", Nama : " + nama);
        });
    }
}

