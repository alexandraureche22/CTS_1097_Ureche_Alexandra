package fisaMedicala;

public abstract class AFisaMedicala {
    protected String sectie;
    protected String numePacient;
    protected String tratament;

    public AFisaMedicala(String sectie, String numePacient, String tratament) {
        this.sectie = sectie;
        this.numePacient = numePacient;
        this.tratament = tratament;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public abstract void afiseazaDetalii();
}
