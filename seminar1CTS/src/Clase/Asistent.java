package Clase;

import Interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    // constructor fara parametrii
    // super apeleaza constructorul acesta din clasa parinta/superclasa
    public Asistent() {
        super();
        this.idAsistent = "anonim";
    }

    // constructor cu parametrii
    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return this.idAsistent;
    }

    @Override
    public void preda() {
        System.out.println(this.getNume() + " preda ca asistent.");
    }
}