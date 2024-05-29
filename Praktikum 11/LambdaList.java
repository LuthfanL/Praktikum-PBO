import java.util.ArrayList;

/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : LambdaList.java
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama)-> System.out.println(nama));
    }
}
