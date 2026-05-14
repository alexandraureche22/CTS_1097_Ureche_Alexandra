package observer.problema1;

public class Banca extends Subject{
    private String nume;

    public Banca(String nume) {
        super();
        this.nume = nume;
    }
    public void trimiteOferta(String oferta){
        super.notifyObserver(oferta);
    }
}
