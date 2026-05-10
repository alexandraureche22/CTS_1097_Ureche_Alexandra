package combinatii2.factoryMethod;

public class MemorieFactory extends ComponentaFactory{
    private static MemorieFactory instance;

    private MemorieFactory() {
    }
    public static MemorieFactory getInstance(){
        if(instance==null){
            instance= new MemorieFactory();
        }
        return instance;
    }

    @Override
    public Stocare creeaza(Tip tip, String nume, double pret) throws Exception {
        switch (tip){
            case EMemorie.RAM_DDR4: return new RAMDDR4(nume,pret);
            case EMemorie.RAM_DDR5: return new RAMDDR5(nume,pret);
            default: throw new Exception("invalid");
        }
    }
}
