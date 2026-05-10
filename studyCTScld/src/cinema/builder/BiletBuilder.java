package cinema.builder;

public class BiletBuilder implements IBilet {
    private String numeSpectacol;
    private String film;
    private int sala;
    private int rand;
    private int scaun;
    private boolean includePopcorn;
    private boolean includeBautura;

    public BiletBuilder(String numeSpectacol, String film) {
        this.numeSpectacol = numeSpectacol;
        this.film = film;
        this.sala =0;
        this.rand =0;
        this.scaun =0;
        this.includePopcorn =false;
        this.includeBautura =false;
    }

    public BiletBuilder setSala(int sala) {
        this.sala = sala;
        return this;
    }

    public BiletBuilder setRand(int rand) {
        this.rand = rand;
        return this;
    }

    public BiletBuilder setScaun(int scaun) {
        this.scaun = scaun;
        return this;
    }

    public BiletBuilder setIncludePopcorn(boolean includePopcorn) {
        this.includePopcorn = includePopcorn;
        return this;
    }

    public BiletBuilder setIncludeBautura(boolean includeBautura) {
        this.includeBautura = includeBautura;
        return this;
    }

    @Override
    public Bilet build() {
        return new Bilet(numeSpectacol,film,sala,rand,scaun,includePopcorn,includeBautura);
    }
}
