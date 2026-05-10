package livrareMancareSub1Zamfi.builder;

import java.util.List;

public class Comanda {
    private String adresa;
    private String telefon;
    private String email;
    private String metodaPlata;
    private String tipAmbalaj;
    private String instructiuni;
    private String cuponReducere;
    private String tipLivrare;
    private List<String> produse;

    public Comanda(String adresa, String telefon, String email, String metodaPlata, String tipAmbalaj, String instructiuni, String cuponReducere, String tipLivrare, List<String> produse) {
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
        this.metodaPlata = metodaPlata;
        this.tipAmbalaj = tipAmbalaj;
        this.instructiuni = instructiuni;
        this.cuponReducere = cuponReducere;
        this.tipLivrare = tipLivrare;
        this.produse = produse;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getMetodaPlata() {
        return metodaPlata;
    }

    public String getTipAmbalaj() {
        return tipAmbalaj;
    }

    public String getInstructiuni() {
        return instructiuni;
    }

    public String getCuponReducere() {
        return cuponReducere;
    }

    public String getTipLivrare() {
        return tipLivrare;
    }

    public List<String> getProduse() {
        return produse;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "adresa='" + adresa + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", metodaPlata='" + metodaPlata + '\'' +
                ", tipAmbalaj='" + tipAmbalaj + '\'' +
                ", instructiuni='" + instructiuni + '\'' +
                ", cuponReducere='" + cuponReducere + '\'' +
                ", tipLivrare='" + tipLivrare + '\'' +
                ", produse=" + produse +
                '}';
    }
}
