package cinema.factory.main;

import cinema.factory.FilmFactory;
import cinema.factory.Proiectie;

public class Main {
    public static void main(String[] args) throws Exception {
        Proiectie proiectie1 = FilmFactory.creeaza("Film2d","regele leu",120,19.99);
        Proiectie proiecte2=FilmFactory.creeaza("Filmimax","dead poets society",90,21.49);
        Proiectie proiecte3=FilmFactory.creeaza("Filmimax","ready or not",91,21.49);
        Proiectie proiecte4=FilmFactory.creeaza("Film3d","scream",100,31.99);
        System.out.println(proiectie1.getTitlu());
        proiecte2.afiseazaDetalii();
        proiecte3.afiseazaDetalii();
        proiecte4.afiseazaDetalii();
    }
}
