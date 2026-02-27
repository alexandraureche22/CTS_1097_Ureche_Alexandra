package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static int sumaFinantata = 60;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int numar_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume, prenume, varsta, punctaj, numar_proiecte, denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}

	public String getFacultate() {
		return this.facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAn_studii() {
		return this.an_studii;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	@Override
	public String toString() {
		return super.toString() + "Facultate=" + facultate + ", An_studii=" + an_studii ;
	}
	public void afisareFinantare() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+sumaFinantata+" Euro/zi in proiect.");
	}

}
