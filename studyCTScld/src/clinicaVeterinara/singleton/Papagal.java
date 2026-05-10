package clinicaVeterinara.singleton;

public class Papagal implements AnimalInternare {
    private String nume;
    private String rasa;
    private int varsta;

    public Papagal(String nume, String rasa, int varsta) {
        this.nume = nume;
        this.rasa = rasa;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getRasa() {
        return rasa;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "Papagal{" +
                "nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", varsta=" + varsta +
                '}');
    }
}
