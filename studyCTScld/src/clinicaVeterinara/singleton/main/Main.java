package clinicaVeterinara.singleton.main;

import clinicaVeterinara.singleton.AnimalFactory;
import clinicaVeterinara.singleton.AnimalInternare;
import clinicaVeterinara.singleton.TipAnimal;
import clinicaVeterinara.singleton.CabinetSingleton;

public class Main {
    public static void main(String[] args) throws Exception {
        CabinetSingleton cabinet1 = CabinetSingleton.getInstance();
        CabinetSingleton cabinet2 = CabinetSingleton.getInstance();
        System.out.println("egale?"+(cabinet1== cabinet2));

        AnimalInternare animal1 =  AnimalFactory.creeazaAnimal(TipAnimal.CAINE,"tango","buldog",1);
        AnimalInternare animal2 =  AnimalFactory.creeazaAnimal(TipAnimal.PISICA,"visina","british",4);
        AnimalInternare animal3 = AnimalFactory.creeazaAnimal(TipAnimal.PAPAGAL,"gizmo","perus alb",2);

        cabinet1.interneazaAnimal (animal1);
        cabinet1.interneazaAnimal(animal2);
        cabinet1.externeazaAnimal();


    }
}
