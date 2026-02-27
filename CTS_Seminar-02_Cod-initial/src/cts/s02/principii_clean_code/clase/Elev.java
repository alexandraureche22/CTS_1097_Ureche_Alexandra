package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantare =  20;

	public Elev() {

		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int numar_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, numar_proiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return this.clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return this.tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public void afisareFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}

}
