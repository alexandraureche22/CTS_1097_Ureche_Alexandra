package composite.spital;

public class Main {
    static void main() {
        Sectie dermatologie = new Sectie("dermatologie");
        Sectie pediatrie = new Sectie("pediatrie");
        Sectie stomatologie = new Sectie("stomatologie");

        Departament adulti = new Departament("Adulti");
        Departament copii = new Departament("Copii");
        Departament spital = new Departament("Spital");

        adulti.adaugaStructura(dermatologie);
        adulti.adaugaStructura(stomatologie);
        copii.adaugaStructura(pediatrie);
        copii.adaugaStructura(stomatologie);

        spital.adaugaStructura(adulti);
        spital.adaugaStructura(copii);

        spital.afiseazaIerarhie("");

    }
}
