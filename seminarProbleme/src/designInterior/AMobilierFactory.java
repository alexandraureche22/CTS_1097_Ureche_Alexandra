package designInterior;

public abstract class AMobilierFactory {
    public abstract AMobilier creeazaFotoliu(String nume, String material, float pret);
    public abstract AMobilier creeazaMasa(String nume, String material, float pret);
    public abstract AMobilier creeazaDulap(String nume, String material, float pret);
}
