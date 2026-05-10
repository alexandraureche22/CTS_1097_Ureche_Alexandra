package produs.resgistry;

import produs.factory.ProdusGeneric;

public class ProdusBio implements ProdusGeneric {
    private String nume;
    private double pret;
    private int stoc;
    private String categorie;
    @Override
    public String getNume() {
        return nume;
    }

    public ProdusBio(String nume, double pret, int stoc, String categorie) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
        this.categorie = categorie;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public int getStoc() {
        return stoc;
    }

    @Override
    public void setStoc(int stoc) {
        this.stoc=stoc;

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "ProdusBio{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", stoc=" + stoc +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ProdusBio{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", stoc=" + stoc +
                ", categorie='" + categorie + '\'' +
                '}');
    }
}
