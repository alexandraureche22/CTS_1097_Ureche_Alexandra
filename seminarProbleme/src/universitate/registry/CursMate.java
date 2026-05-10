package universitate.registry;

public class CursMate extends ACurs{
    private static CursMate instance;
    private CursMate(){
        super("Geometrie in spatiu","curs 20:00",3);
    }
    public static CursMate getInstance(){
        if(instance==null){
            instance = new CursMate();
        }
        return instance;
    }
    public CursMate(String nume, String descriere, int id) {
        super(nume, descriere, id);
    }

    @Override
    public void getDetalii() {
        System.out.println("Mate"+super.toString());

    }

    @Override
    public void startCurs() {
        System.out.println("Cursul "+super.getNume()+"incepe..");
    }
}
