//Nama : Muhammad Luthfan Lazuardi 
//NIM : 24060122120010


class MTitik
{
	public static void main(String[] args)
	{
		Titik t1, t2, t3;

		t1 = new Titik();
		t2 = new Titik();

		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2.setAbsis(3);
		t2.setOrdinat(4);

		t3 = new Titik(5,6);

		System.out.println("T1: " + t1.getAbsis()+ ", " + t1.getOrdinat());
		System.out.println("T2: " + t2.getAbsis()+ ", " + t2.getOrdinat());
		System.out.println("T3: " + t3.getAbsis()+ ", " + t3.getOrdinat());
		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());

		System.out.println("Jarak T3 ke pusat : " + t3.getJarakPusat());

		t1.refleksiX(t1);
		System.out.println("Titik setelah refleksi X: " + t1.getAbsis()+ ", " + t1.getOrdinat());

		t1.refleksiY(t1);
		System.out.println("Titik setelah refleksi Y: " + t1.getAbsis()+ ", " + t1.getOrdinat());

		t1.getRefleksiX(t1);
		System.out.println("Titik setelah refleksi X menggunakan getRefleksiX: " + t1.getAbsis()+ ", " + t1.getOrdinat());

		t1.getRefleksiY(t1);
		System.out.println("Titik setelah refleksi X menggunakan getRefleksiY: " + t1.getAbsis()+ ", " + t1.getOrdinat());
	}
}