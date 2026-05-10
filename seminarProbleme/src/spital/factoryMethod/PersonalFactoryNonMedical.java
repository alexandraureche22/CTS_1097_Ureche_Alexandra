package spital.factoryMethod;


public class PersonalFactoryNonMedical extends AbstractPersonalFactory {

    @Override
    public IPersonal creeaza(String tip, String nume, int vechime) throws Exception {
        switch (tip){
            case "Secretar": return new Secretar(nume, vechime);
            case "Registrator": return new Registrator(nume, vechime);
            default: throw new Exception("tip invalid");
        }
    }
}
