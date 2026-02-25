package Clase;

import Interfete.IPersoana;

// O clasa extinde o singura alta clasa, dar poate implementa multiple interfete
public class Persoana implements IPersoana, Cloneable {
    private String nume;
    private int varsta;

    // constructor fara parametrii
    public Persoana() {
        this.nume = "Anonim";
        this.varsta = 0;
    }

    // constructor cu parametrii
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // constructor de copiere
    public Persoana(Persoana altaPersoana) {
        this.nume = altaPersoana.nume;
        this.varsta = altaPersoana.varsta;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public Persoana clone() {
        try {
            Persoana clone = (Persoana) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}