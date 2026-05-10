package fisaMedicala;

public class FisaPacient extends AFisaMedicala{
    public FisaPacient(String sectie, String numePacient, String tratament) {
        super(sectie, numePacient, tratament);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("FisaPacient{" +
                "sectie='" + sectie + '\'' +
                ", numePacient='" + numePacient + '\'' +
                ", tratament='" + tratament + '\'' +
                '}');
    }
}
