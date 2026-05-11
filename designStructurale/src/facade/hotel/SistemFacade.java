package facade.hotel;

public class SistemFacade {
    private Disponibilitate disponibilitate;
    private Preturi preturi;
    private Validitate validitate;

    public SistemFacade(Disponibilitate disponibilitate, Preturi preturi, Validitate validitate) {
        this.disponibilitate = disponibilitate;
        this.preturi = preturi;
        this.validitate = validitate;
    }
    public void verificaSistemele(){
        if(!disponibilitate.verificaDisponibilitate()){
            System.out.println("Nu exista disponibilitate");
            return;
        }
        if(!preturi.isEsteInBuget()){
            System.out.println("Preturile nu corespund.");
            return;
        }
        if(!validitate.isSuntDocumenteleValide()){
            System.out.println("Documentele nu sunt valide.");
            return;
        }
        System.out.println("Totul este disponibil. Se face rezervarea.");

    }
}
