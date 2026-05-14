package chainofresponsability.problema2;

public class Consultant extends Handler{

    @Override
    public void trateaza(CerereImprumut cerereImprumut) {
        if(cerereImprumut.getSuma()<5000){
            System.out.println("Cererea a fost aprobata in valoare de: "+cerereImprumut.getSuma());
        }
        else if(super.getSuccesor()!=null){
            System.out.println("Cererea este trimisa mai departe...");
            super.getSuccesor().trateaza(cerereImprumut);
        }
        else{
            System.out.println("Nu exista succesor.");
        }
    }
}
