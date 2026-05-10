package fisaMedicala;

public abstract class AFisaFactory {
    public abstract FisaPacient creeaza(String sectie, String numePacient, String tratament);
    public abstract FisaDoctor creeaza(String sectie, String numePacient, String tratament, String notite);
}
