package iar.factoryMethod;

public class PersonalNonMedical extends PersonalSpitalFactory{
    private static PersonalNonMedical instance;
    private PersonalNonMedical(){}
    public static PersonalNonMedical getInstance(){
        if(instance==null){
            instance = new PersonalNonMedical();
        }
        return instance;
    }
    @Override
    public PersonalSpital creeazaMedical(Tip tip, String nume, int vechime) throws Exception {
        switch (tip){
            case NonMedical.SECRETAR : return new Secretar(nume, vechime);
            case NonMedical.REGISTRATOR : return new Registrator(nume, vechime);
            default:throw new Exception("tip invalid");
        }
    }
}
