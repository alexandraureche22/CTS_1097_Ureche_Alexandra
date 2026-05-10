package fisaMedicala;

public class Cardiologie extends  AFisaFactory{
    @Override
    public FisaPacient creeaza(String sectie, String numePacient, String tratament) {
        return new FisaPacient(sectie,numePacient,tratament);
    }

    @Override
    public FisaDoctor creeaza(String sectie, String numePacient, String tratament, String notite) {
        return new FisaDoctor(sectie,numePacient,tratament,notite);
    }
}
