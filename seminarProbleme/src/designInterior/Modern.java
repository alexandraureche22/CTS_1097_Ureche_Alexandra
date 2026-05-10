package designInterior;

public class Modern extends AMobilierFactory{

    @Override
    public AMobilier creeazaFotoliu(String nume, String material, float pret) {
        return new Fotoliu(nume,material,pret);
    }

    @Override
    public AMobilier creeazaMasa(String nume, String material, float pret) {
        return new Masa(nume, material, pret);
    }

    @Override
    public AMobilier creeazaDulap(String nume, String material, float pret) {
        return new Dulap(nume, material, pret);
    }
}
