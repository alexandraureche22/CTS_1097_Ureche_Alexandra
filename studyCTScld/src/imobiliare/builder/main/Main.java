package imobiliare.builder.main;

import imobiliare.builder.Cerere;
import imobiliare.builder.CerereBuilder;

public class Main {
    public static void main(String[] args) {
        Cerere cerere1 = new CerereBuilder("Bucuresti").setTip("aparatament").setEtaj(4).setNrCamere(3).build();
        Cerere cerere2 = new CerereBuilder("Iasi").setTip("Casa").setSuprafataMaxima(100).setPretMinim(200).setNrCamere(3).build();
        cerere1.afiseazaCerere();
        cerere2.afiseazaCerere();

    }
}
