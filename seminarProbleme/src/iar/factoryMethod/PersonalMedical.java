package iar.factoryMethod;

import iar.factoryMethod.PersonalSpitalFactory;

public class PersonalMedical extends PersonalSpitalFactory {
    private static PersonalMedical instance;
    private PersonalMedical(){}
    public static PersonalMedical getInstance(){
        if(instance==null){
            instance = new PersonalMedical();
        }
        return instance;
    }
    @Override
    public PersonalSpital creeazaMedical(Tip tip, String nume, int vechime) throws Exception {
        switch (tip){
            case Medical.MEDIC : return new Medic(nume, vechime);
            case Medical.ASISTENT : return new Asistent(nume, vechime);
            case Medical.BRANCARDIER : return new Brancardier(nume, vechime);
            default:throw new Exception("tip invalid");
        }
    }
}
