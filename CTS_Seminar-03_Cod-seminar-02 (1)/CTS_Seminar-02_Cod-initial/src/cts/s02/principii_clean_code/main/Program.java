package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;
import cts.s02.principii_clean_code.readers.StudentReader;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		AplicantReader reader = new StudentReader();

		for(Aplicant aplicant : reader.citireAplicanti("C:\\Users\\mgodz\\Downloads\\CTS_Seminar-03\\CTS_Seminar-03\\CTS_Seminar-02_Cod-initial_2\\CTS_Seminar-02_Cod-initial\\studenti.txt")) {
			System.out.println(aplicant.toString());
			aplicant.afisareStatutAplicant();
		}
	}

}
