package livrareMancareSub1Zamfi.prototype;

import livrareMancareSub1Zamfi.factory.NotificareSistem;

public class Flyer implements ICopiaza,IFlyer{
    private String tipComanda;
    private NotificareSistem notificare;

    public Flyer(String tipComanda) {
        this.tipComanda = tipComanda;
    }

    public Flyer(Flyer altul) {
        this.tipComanda = altul.tipComanda;
        this.notificare = altul.notificare;
    }

    @Override
    public ICopiaza clonare() {
        return new Flyer(this);
    }

    @Override
    public String toString() {
        return "Flyer{" +
                "tipComanda='" + tipComanda + '\'' +
                ", notificare=" + notificare +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Flyer{" +
                "tipComanda='" + tipComanda + '\'' +
                ", notificare=" + notificare +
                '}');

    }

    public void setNotificare(NotificareSistem notificare) {
        this.notificare = notificare;
    }
}
