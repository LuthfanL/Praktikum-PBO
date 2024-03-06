/*
 * File     : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Nama / NIM   : Muhammad Luthfan Lazuardi / 24060122120010
 * Tanggal      : 6 Maret 2024
 */


//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
/* PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
   JAWAB :
   Ada kesalahan konsep pada program Asersi2. Pada saat membuat Lingkaran dan menghitung keliling lingkaran, nilai jariJari yang digunakan yaitu 0.
   Kemudian, menggunakan asert statement untuk memeriksa apakah nilai jariJari lebih besar dari 0. Namun, karena nilai jariJari 0, maka
   asert statement ini akan gagal selalu.
 */
