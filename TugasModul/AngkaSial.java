/*
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                pengenalan klausa 'throw' dan 'throws'
 * Nama / NIM   : Muhammad Luthfan Lazuardi / 24060122120010
 * Tanggal      : 6 Maret 2024
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka asli");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
              //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
PERTANYAAN:
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
JAWAB :
*Saat memanggil as.cobaAngka(10)), dieksekusi.
 Saat memanggil as.cobaAngka(12)), dieksekusi.
 Saat memanggil as.cobaAngka(13)), tidak dieksekusi.
*Baris 21 pada AngkaSial.java dieksekusi setelah eksepsi terjadi.
 */