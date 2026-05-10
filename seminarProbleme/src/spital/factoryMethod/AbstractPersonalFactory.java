package spital.factoryMethod;

public abstract class AbstractPersonalFactory {
    public abstract IPersonal creeaza(String tip, String nume, int vechime) throws Exception;
}
