//Nama : Muhammad Luthfan Lazuardi 
//NIM : 24060122120010


class Titik
{
	/*Atribut*/
	double absis, ordinat;
	static double counterTitik;

	/*Konstruktor*/
	Titik()
	{
        	absis = 0;
        	ordinat = 0;
        	counterTitik++;
	}

	Titik(double a, double b)
	{
		absis = a;
        	ordinat = b;
        	counterTitik++;
	}

	void setAbsis(double a)
	{
		absis = a;
	}

	double getAbsis()
	{
		return absis;
	}

	void setOrdinat(double b)
	{
		ordinat = b;
	}

	double getOrdinat()
	{
		return ordinat;
	}

	static double getCounterTitik()
	{
		return counterTitik;
	}

}