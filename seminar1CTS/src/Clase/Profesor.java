package Clase;

import Interfete.IPredabil;


public class Profesor extends Persoana implements IPredabil, Cloneable {
    private String idAngajat;

    // constructor fara parametrii
    public Profesor() {
        super();
        this.idAngajat = "P00";
    }

    // constructor cu parametrii
    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    // constructor de copiere
    public Profesor(Profesor altProfesor) {
        super(altProfesor);
        this.idAngajat = altProfesor.idAngajat;
    }

    public String getIdAngajat() {
        return this.idAngajat;
    }

    @Override
    public void preda() {
        System.out.println(this.getNume() + " preda ca profesor.");
    }

    @Override
    public Profesor clone() {
        Profesor clone = (Profesor) super.clone();
        return clone;
    }
}