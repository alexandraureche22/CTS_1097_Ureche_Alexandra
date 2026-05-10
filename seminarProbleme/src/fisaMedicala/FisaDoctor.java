package fisaMedicala;

public class FisaDoctor extends AFisaMedicala{
    private String notite;
    public FisaDoctor(String sectie, String numePacient, String tratament, String notite) {
        super(sectie, numePacient, tratament);
        this.notite=notite;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("FisaDoctor{" +
                "notite='" + notite + '\'' +
                ", sectie='" + sectie + '\'' +
                ", numePacient='" + numePacient + '\'' +
                ", tratament='" + tratament + '\'' +
                '}');
    }
}
