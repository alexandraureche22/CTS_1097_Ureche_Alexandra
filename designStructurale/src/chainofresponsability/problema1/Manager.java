package chainofresponsability.problema1;

public class Manager extends Handler{
    @Override
    public void trateaza(CerereDespagubire cerereDespagubire) {
        if(cerereDespagubire.getSuma()>=1000 && cerereDespagubire.getSuma()<=10000){
            System.out.println("Managerul a acceptata cererea"+cerereDespagubire.getNume());

        }
        else if(super.getSuccesor()!=null){
            System.out.println("Cererea este trimisa mai departe..");
            super.getSuccesor().trateaza(cerereDespagubire);
        }
        else{
            System.out.println("Nu exista succesor.");
        }
    }
}
