package cinema.factory;

public class Film2d implements Proiectie{
    private String titlu;
    private int durata;
    private double pret;

    public Film2d(String titlu, int durata, double pret) {
        this.titlu = titlu;
        this.durata = durata;
        this.pret = pret;
    }

    @Override
    public String getTitlu() {
        return titlu;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public double getPretBilet() {
        return pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Film2d{" +
                "titlu='" + titlu + '\'' +
                ", durata=" + durata +
                ", pret=" + pret +
                '}');
    }
}
