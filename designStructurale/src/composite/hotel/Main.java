package composite.hotel;

public class Main {
    static void main() {
        Hotel h1 = new Hotel("Grand Budapest",5,219.9f);
        Hotel h2 = new Hotel("Bucuresti Continental",4,213.3f);
        Hotel h3 = new Hotel("Hotel Unirii",3,129);
        Hotel h4 = new Hotel("Hotel Cimisigiu",3,199.3f);
        Hotel h5 = new Hotel("Hotel Hilton",5,666.5f);

        Locatie romania = new Locatie("Romania");
        Locatie ungaria = new Locatie("Ungaria");
        Locatie new_york = new Locatie("New York");
        romania.adaugaDestinatie(h1);
        ungaria.adaugaDestinatie(h2);
        romania.adaugaDestinatie(h3);
        romania.adaugaDestinatie(h4);
        new_york.adaugaDestinatie(h5);

        Locatie europa = new Locatie("Europa");
        Locatie america = new Locatie("America");
        europa.adaugaDestinatie(romania);
        europa.adaugaDestinatie(ungaria);
        america.adaugaDestinatie(new_york);

        Locatie destinatie = new Locatie("Destinatie");
        destinatie.adaugaDestinatie(europa);
        destinatie.adaugaDestinatie(america);

        Locatie catalog = new Locatie("Catalog");
        catalog.adaugaDestinatie(destinatie);
        catalog.afiseazaIerarhie(" ");



    }
}
