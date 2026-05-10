package clinicaVeterinara.singleton;

public interface ICabinet {
    void interneazaAnimal(AnimalInternare animal);
    void externeazaAnimal();
    AnimalInternare getAnimalCurent();
}
