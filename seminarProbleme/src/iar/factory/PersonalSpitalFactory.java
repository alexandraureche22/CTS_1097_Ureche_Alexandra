package iar.factory;

public class PersonalSpitalFactory {
    private static PersonalSpitalFactory instance;
    private PersonalSpitalFactory(){}
    public static synchronized PersonalSpitalFactory getInstance(){
        if(instance==null){
            instance = new PersonalSpitalFactory();
        }
        return instance;
    }
    public PersonalSpital creeaza(Tip tip, String nume, int vechime) throws Exception {
        switch (tip){
            case MEDIC : return new Medic(nume,vechime);
            case ASISTENT : return new Asistent(nume,vechime);
            case BRANCARDIER : return new Brancardier(nume,vechime);
            default:throw new Exception("tip invalid");
        }
    }
}
