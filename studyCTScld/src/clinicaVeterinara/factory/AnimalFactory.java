package clinicaVeterinara.factory;

public class AnimalFactory {
    public static AnimalInternare creeazaAnimal(TipAnimal tip, String nume, String rasa, int varsta) throws Exception {
        switch (tip){
            case CAINE : return new Caine(nume,rasa,varsta);
            case PISICA:  return new Pisica(nume,rasa,varsta);
            case PAPAGAL:  return new Papagal(nume,rasa,varsta);
            default: throw new Exception("tip invalid.");
        }
    }
}
