package spital.factoryMethod;

public class PersonalFactoryMedical extends AbstractPersonalFactory {
    @Override
    public spital.factoryMethod.IPersonal creeaza(String tip, String nume, int vechime) throws Exception {
        switch (tip){
            case "Medic" : return new Medic(nume,vechime);
            case "Asistent":  return new Asistent(nume,vechime);
            case "Brancardier": return new Brancardier(nume,vechime);
            default : throw new Exception("invalid tip");
        }
    }
}
