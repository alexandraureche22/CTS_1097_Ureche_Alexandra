package chainofresponsability.problema1;

public class Agent extends Handler {

    @Override
    public void trateaza(CerereDespagubire cerereDespagubire) {
        if(cerereDespagubire.getSuma() < 1000){
            System.out.println("Agentul a aprobat cererea pentru: "+cerereDespagubire.getNume());
        }
        else if(super.getSuccesor()!=null){
            System.out.println("Agentul trimite cererea mai departe..");
            super.getSuccesor().trateaza(cerereDespagubire);
        }
        else{
            System.out.println("Nu exista succesor.");
        }
    }
}
