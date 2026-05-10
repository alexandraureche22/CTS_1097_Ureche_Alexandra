package zoo.singleton;

public class Alarma implements ISetAlarma{
    private String mesajCurent;
    private static Alarma instance;

    private Alarma() {
    }
    public static synchronized Alarma getInstance(){
        if(instance ==null){
            instance = new Alarma();
        }
        return instance;
    }

    @Override
    public void activeazaAlarma(String mesaj) {
        if(mesajCurent == null){
            mesajCurent = mesaj;
            System.out.println("Alarma este activata: "+mesaj);
        }
        else System.out.println("Alarma este deja pornita.");
    }

    @Override
    public void dezactiveazaAlarma() {
        if(mesajCurent != null){
            System.out.println("Alarma s a dezactivat.");
            mesajCurent = null;
        }
        else System.out.println("Alarma nu este pornita.");

    }

    @Override
    public boolean esteActiva() {
        return mesajCurent != null;
    }

    @Override
    public String getMesajAlerta() {
        return mesajCurent;
    }
}
