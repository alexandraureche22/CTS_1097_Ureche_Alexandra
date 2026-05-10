package livrareMancareSub1Zamfi.builder;

import java.util.ArrayList;
import java.util.List;

public class ComandaBuilder implements IComanda {
    private String adresa;
    private String telefon;
    private String email;
    private String metodaPlata;
    private String tipAmbalaj;
    private String instructiuni;
    private String cuponReducere;
    private String tipLivrare;
    private List<String> produse;

    public ComandaBuilder() {
        this.adresa = "necunoscut";
        this.telefon = "necunoscut";
        this.email = "necunoscut";
        this.metodaPlata = "necunoscut";
        this.tipAmbalaj = "necunoscut";
        this.instructiuni = "necunoscut";
        this.cuponReducere = "necunoscut";
        this.tipLivrare = "necunoscut";
        this.produse = new ArrayList<>();
    }

    public ComandaBuilder setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    public ComandaBuilder setTelefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    public ComandaBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ComandaBuilder setMetodaPlata(String metodaPlata) {
        this.metodaPlata = metodaPlata;
        return this;
    }

    public ComandaBuilder setTipAmbalaj(String tipAmbalaj) {
        this.tipAmbalaj = tipAmbalaj;
        return this;
    }

    public ComandaBuilder setInstructiuni(String instructiuni) {
        this.instructiuni = instructiuni;
        return this;
    }

    public ComandaBuilder setCuponReducere(String cuponReducere) {
        this.cuponReducere = cuponReducere;
        return this;
    }

    public ComandaBuilder setTipLivrare(String tipLivrare) {
        this.tipLivrare = tipLivrare;
        return this;
    }

    public ComandaBuilder setProduse(List<String> produse) {
        this.produse = produse;
        return this;
    }

    @Override
    public Comanda build() {
        return new Comanda(adresa,telefon,email,metodaPlata,tipAmbalaj,instructiuni,cuponReducere,tipLivrare,produse);
    }
}
