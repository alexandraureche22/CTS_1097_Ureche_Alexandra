package composite.restaurant;

public class Main {
    static void main() {
        Item apa = new Item("apa plata");
        Item apaminerala = new Item("Apa minerala");
        Item sucPortocale = new Item("Suc portocale");
        Item cafea = new Item("Cafea");

        Sectiune sucuri = new Sectiune("Sucuri");
        Sectiune bauturiCalde = new Sectiune("Bauturi calde");

        sucuri.adaugaComponenta(apa);
        sucuri.adaugaComponenta(apaminerala);
        sucuri.adaugaComponenta(sucPortocale);
        bauturiCalde.adaugaComponenta(cafea);

        Sectiune bauturi = new Sectiune("Bauturi");
        Sectiune mancare = new Sectiune("Mancare");
        bauturi.adaugaComponenta(sucuri);
        bauturi.adaugaComponenta(bauturiCalde);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaComponenta(bauturi);
        meniu.afiseazaMneiu(" ");

    }
}
