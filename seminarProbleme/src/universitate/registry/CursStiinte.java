package universitate.registry;

public class CursStiinte extends ACurs{
    private static CursStiinte instance;
    private CursStiinte(){
        super("Curs fizica cuantica","curs facultativ",5);
    }
    public static CursStiinte getInstance(){
        if(instance==null){
            instance = new CursStiinte();
        }
        return instance;
    }
    public CursStiinte(String nume, String descriere, int id) {
        super(nume, descriere, id);
    }

    @Override
    public void getDetalii() {
        System.out.println("Stiinte"+super.toString());

    }

    @Override
    public void startCurs() {
        System.out.println("Cursul "+super.getNume()+"incepe..");
    }
}
