import java.util.ArrayList;
/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : LambdaList2.java
 * Deskripsi : Implementasi lambda block pada list, digunakan sebagai parameter pada method.
 */
public class LambdaList2 {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda block digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}
