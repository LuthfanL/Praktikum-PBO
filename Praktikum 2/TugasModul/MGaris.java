class MGaris
{
    public static void main(String[] args)
    {
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(3, 4);

        Garis g1 = new Garis(t1, t2);

        System.out.println(g1);
        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
    }
}
