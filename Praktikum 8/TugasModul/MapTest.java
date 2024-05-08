/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();

        // iterasi untuk mengambil keseluruhan kunci dan nilai
        for (Integer keys : key) { //keys akan mengambil nilai dari setiap elemen dalam set key yang bertipe Integer.
            //System.out.print(keys+" ");
            String value = map.get(keys);
            System.out.println("Key: " + keys + ", nilai: " + value);
        }
    }
}
