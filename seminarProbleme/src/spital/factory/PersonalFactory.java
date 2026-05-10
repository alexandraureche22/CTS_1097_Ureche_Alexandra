package spital.factory;

public class PersonalFactory {
    public static IPersonal creeaza(TipPersonal tip, String nume, int vechime) throws Exception {
        switch (tip){
            case Medic : return new Medic(nume,vechime);
            case Asistent:  return new Asistent(nume,vechime);
            case Brancardier: return new Brancardier(nume,vechime);
            default : throw new Exception("invalid tip");
        }
    }
}
