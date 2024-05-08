/*
 * Nama	    	: Muhammad Luthfan Lazuardi
 * NIM	    	: 24060122120010
 * File	    	: Senjata.java
 * Deskripsi	: representasi dasar dari objek Senjata
 */
package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }

    public void menembak(){
        System.out.println(getBunyi());
        setPeluru(getPeluru() - 1);
        System.out.println("Sisa Peluru: " + getPeluru());
    }
}
