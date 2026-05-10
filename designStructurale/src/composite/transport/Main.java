package composite.transport;

public class Main {
    static void main() {
        Autobuz a1 = new Autobuz("Mercedes", "Citaro S", 10);
        Autobuz a2 = new Autobuz("Volvo", "7700 S", 10);
        Autobuz a3 = new Autobuz("MAN", "Lion City M", 30);
        Autobuz a4 = new Autobuz("Mercedes", "Citaro M", 30);
        Autobuz a5 = new Autobuz("Volvo", "7900 L", 50);
        Autobuz a6 = new Autobuz("MAN", "Lion City L", 50);

        GrupAutobuze mici = new GrupAutobuze("Mici");
        GrupAutobuze medii = new GrupAutobuze("Medii");
        GrupAutobuze mari = new GrupAutobuze("Mari");
        mici.adaugaComponenta(a1);
        mici.adaugaComponenta(a2);
        medii.adaugaComponenta(a3);
        medii.adaugaComponenta(a3);
        medii.adaugaComponenta(a4);
        mari.adaugaComponenta(a5);
        mari.adaugaComponenta(a6);

        GrupAutobuze flota = new GrupAutobuze("Flota");
        flota.adaugaComponenta(mici);
        flota.adaugaComponenta(medii);
        flota.adaugaComponenta(mari);
        flota.afisareIerarhie(" ");
    }
}
