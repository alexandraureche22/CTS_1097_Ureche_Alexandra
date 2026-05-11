package facade.hotel;

public class Validitate {
    private boolean suntDocumenteleValide;

    public Validitate(boolean suntDocumenteleValide) {
        this.suntDocumenteleValide = suntDocumenteleValide;
    }
    public boolean isSuntDocumenteleValide(){
        if(suntDocumenteleValide){
            System.out.println("Documentele sunt valide.");
            return true;
        }
        else{
            System.out.println("Documentele nu sunt valide.");
            return false;
        }
    }
}
