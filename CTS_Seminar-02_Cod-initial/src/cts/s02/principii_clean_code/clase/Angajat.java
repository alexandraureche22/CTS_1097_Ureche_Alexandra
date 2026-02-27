package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata = 20;

	public Angajat() {
		super();
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int numar_proiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, numar_proiecte, denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public String getOcupatie() {
		return this.ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return this.salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return super.toString() + "ocupatie=" + this.ocupatie + ", salariu=" + this.salariu;
	}

	public void afisareFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");
	}
}
