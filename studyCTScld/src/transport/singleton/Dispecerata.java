package transport.singleton;

public class Dispecerata implements IDispecerata{
    private static Dispecerata instance;
    private String cursaActiva;

    private Dispecerata() {
    }
    public static synchronized Dispecerata getInstance()
    {
        if(instance==null){
            instance = new Dispecerata();
        }
        return instance;
    }

    @Override
    public void incepesCursa(String destinatie) {
        if(cursaActiva==null){
            cursaActiva = destinatie;
            System.out.println("Cursa este activa spre "+destinatie);
        }
        else{
            System.out.println("Cursa este ocupata.");
        }
    }

    @Override
    public void finalizeazaCursa() {
        if(cursaActiva!=null){
            System.out.println("Cursa este finalizata.");
            cursaActiva=null;
        }
        else System.out.println("NU exista cursa activa");

    }

    @Override
    public String getCursaActiva() {
        return cursaActiva;
    }
}
