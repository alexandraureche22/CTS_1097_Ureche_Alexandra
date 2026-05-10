package universitate.registry;

public class CursArte extends ACurs{
    private static CursArte instance;
    private CursArte(){
        super("Arte plastice","curs optional",1);
    }
    public static CursArte getInstance(){
        if(instance==null){
            instance = new CursArte();
        }
        return instance;
    }

    public CursArte(String nume, String descriere, int id) {
        super(nume, descriere, id);
    }

    @Override
    public void getDetalii() {
        System.out.println("Arte"+super.toString());

    }

    @Override
    public void startCurs() {
        System.out.println("Cursul "+super.getNume()+"incepe..");
    }
}
