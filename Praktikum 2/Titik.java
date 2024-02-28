//Nama : Muhammad Luthfan Lazuardi 
//NIM : 24060122120010


public class Titik
{
	/*Atribut*/
	private double absis, ordinat;
	private static double counterTitik;

	/*Konstruktor*/
	Titik()
	{
        	absis = 0;
        	ordinat = 0;
        	counterTitik++;
	}

	public Titik(double a, double b)
	{
		absis = a;
        	ordinat = b;
        	counterTitik++;
	}

	public void setAbsis(double a)
	{

		absis = a;
	}

	public double getAbsis()
	{

		return absis;
	}

	public void setOrdinat(double b)
	{

		ordinat = b;
	}

	public double getOrdinat()
	{
		return ordinat;
	}

	public static double getCounterTitik()
	{

		return counterTitik;
	}

	public double getJarakPusat() {
		return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
	}

	public void refleksiX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat *= -1;
		titik.setOrdinat(ordinat);
	}

	public void refleksiY(Titik titik) {
		double absis = titik.getAbsis();
		absis *= -1;
		titik.setAbsis(absis);
	}

	public void getRefleksiX(Titik t) {
		refleksiX(t);
	}

	public void getRefleksiY(Titik t) {
		refleksiY(t);
	}

}