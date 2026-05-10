package proxy.spital;

public class SpitalProxy implements ISpital{
    private ISpital spital;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void internarePacient(Pacient pacient) {
        if(pacient.isAsigurareSanatate()){
            spital.internarePacient(pacient);
        }
        else{
            System.out.println("Pacientul nu are asigurare de sanatate.");
        }
    }
}
