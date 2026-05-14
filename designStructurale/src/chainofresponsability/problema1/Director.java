package chainofresponsability.problema1;

public class Director extends Handler{
    @Override
    public void trateaza(CerereDespagubire cerereDespagubire) {
        if(cerereDespagubire.getSuma() >10000){
            System.out.println("Directorul a acceptata cererea "+cerereDespagubire.getNume());
        }
        else {
            System.out.println("Cererea nu poate fi aprobata.");
        }
    }
}
