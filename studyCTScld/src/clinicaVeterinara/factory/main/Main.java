package clinicaVeterinara.factory.main;

import clinicaVeterinara.factory.AnimalFactory;
import clinicaVeterinara.factory.AnimalInternare;
import clinicaVeterinara.factory.TipAnimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        AnimalInternare animal1 = AnimalFactory.creeazaAnimal(TipAnimal.CAINE,"tango","buldog",1);
        AnimalInternare animal2 = AnimalFactory.creeazaAnimal(TipAnimal.PISICA,"visina","british",4);
        AnimalInternare animal3 = AnimalFactory.creeazaAnimal(TipAnimal.PAPAGAL,"gizmo","perus alb",2);
        animal1.afiseazaDetalii();
        animal2.afiseazaDetalii();
        animal3.afiseazaDetalii();
        AnimalInternare animal4 = AnimalFactory.creeazaAnimal(TipAnimal.PISICA,"rock","sfinx",2);
        animal4.afiseazaDetalii();


    }
}