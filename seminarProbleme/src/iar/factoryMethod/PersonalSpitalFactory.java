package iar.factoryMethod;

public abstract class PersonalSpitalFactory {
//    private static PersonalSpitalFactory instance;
//    private PersonalSpitalFactory(){}
//    public static synchronized PersonalSpitalFactory getInstance(){
//        if(instance==null){
//            instance = new PersonalSpitalFactory();
//        }
//        return instance;
//    }
    public abstract PersonalSpital creeazaMedical(Tip tip, String nume, int vechime) throws Exception;

}
