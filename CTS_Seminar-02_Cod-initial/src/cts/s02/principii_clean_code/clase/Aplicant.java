package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numar_proiecte;
	protected String[] denumiriProiecte;
	private static int pragAcceptare = 80; //static pentru variabila globala

	public Aplicant() {
		super();

	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numar_proiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numar_proiecte = numar_proiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return this.punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNumar_proiecte() {
		return this.numar_proiecte;
	}

	public void setNumar_proiecte(int numar_proiecte, String[] denumiriProiecte) {
		this.numar_proiecte = numar_proiecte;
		this.denumiriProiecte = new String[numar_proiecte];
		for(int i = 0; i < numar_proiecte; i++){
			this.denumiriProiecte[i] = denumiriProiecte[i];
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append("Aplicant nume: ");
		builder.append(this.nume);
		builder.append("Aplicant prenume: ");
		builder.append(this.prenume);
		builder.append("Varsta: ");
		builder.append(this.varsta);
		builder.append("Punctaj: ");
		builder.append(this.punctaj);
		builder.append("Numar proiecte: ");
		builder.append(this.numar_proiecte);
		builder.append("Denumiri proiecte: ");
		builder.append(Arrays.toString(this.denumiriProiecte));
		builder.append("]");
		return builder.toString();

	}

	public void statutAplicant(){
		//operatorul ternar
		System.out.println("Aplicantul " + this.nume + " " + this.prenume +
				(this.punctaj > pragAcceptare ? " " : "nu") + "a fost acceptat.");
	}
}
