package chainofresponsability.problema2;

public class DirectorGeneral extends Handler{


    @Override
    public void trateaza(CerereImprumut cerereImprumut) {
        if(cerereImprumut.getSuma() > 50000){
            System.out.println("Directorul general a acceptat cererea in valoare de: "+cerereImprumut.getSuma());
        }
        else{
            System.out.println("Cererea nu poate fi aprobata.");
        }
    }
}
