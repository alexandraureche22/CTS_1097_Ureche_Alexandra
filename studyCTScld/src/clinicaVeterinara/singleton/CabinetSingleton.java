package clinicaVeterinara.singleton;

public class CabinetSingleton implements ICabinet{
    private AnimalInternare animalCurent;
    private static CabinetSingleton instance;

    private CabinetSingleton() {
        this.animalCurent = null;
    }
    public static CabinetSingleton getInstance(){
        if(instance==null){
            instance=new CabinetSingleton();
        }
        return instance;
    }

    @Override
    public void interneazaAnimal(AnimalInternare animal) {
        if(animalCurent==null){
            animalCurent = animal;
            System.out.println("Animal internat: "+animal.getNume());
        }
        else System.out.println("Cabinet ocupat.");

    }

    @Override
    public void externeazaAnimal() {
        if(animalCurent!=null){
            System.out.println("Animal externat"+animalCurent.getNume());
            animalCurent=null;
        }
        else System.out.println("NU exista animal internat.");

    }

    @Override
    public AnimalInternare getAnimalCurent() {
        return animalCurent;
    }
}
