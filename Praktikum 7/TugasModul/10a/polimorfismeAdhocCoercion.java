/*
 * Nama		    : Muhammad Luthfan Lazuardi
 * NIM		    : 24060122120010
 * File		    : polimorfismeAdhocCoercion.java
 */

public class polimorfismeAdhocCoercion {
    public static void main(String[] args){
        // 1. Berhasil dieksekusi, coercion menghasilkan angka 97 dari ASCII 'a'
        //int output = 'a';

        // 2. Gagal dieksekusi, tidak dapat dari double ke int harus menggunakan secara casting int output = (int) x;
        double x = 15.5;
        int output = x;

        // 3. Berhasil dieksekusi, coercion (mengubah tipe data dari integer ke double) menghasilkan 25.0
        //int y = 25;
        //double output = y;

        // 4. Berhasil dieksekusi, casting (mengubah tipe data integer ke char) menghasilkan N
        //int z = 78;
        //char output = (char)z;

        // 5. Berhasil dieksekusi, coercion (mengubah tipe char menjadi double) menghasilkan 97.0
        //char a = 'a';
        //double output = a;

        System.out.println(output);

    }
}
