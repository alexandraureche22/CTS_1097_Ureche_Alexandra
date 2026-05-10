package cinema.builder;

public class Bilet {
    private String numeSpectacol;
    private String film;
    private int sala;
    private int rand;
    private int scaun;
    private boolean includePopcorn;
    private boolean includeBautura;

    public Bilet(String numeSpectacol, String film, int sala, int rand, int scaun, boolean includePopcorn, boolean includeBautura) {
        this.numeSpectacol = numeSpectacol;
        this.film = film;
        this.sala = sala;
        this.rand = rand;
        this.scaun = scaun;
        this.includePopcorn = includePopcorn;
        this.includeBautura = includeBautura;
    }

    public String getFilm() {
        return film;
    }

    public String getNumeSpectacol() {
        return numeSpectacol;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeSpectacol='" + numeSpectacol + '\'' +
                ", film='" + film + '\'' +
                ", sala=" + sala +
                ", rand=" + rand +
                ", scaun=" + scaun +
                ", includePopcorn=" + includePopcorn +
                ", includeBautura=" + includeBautura +
                '}';
    }
}
