package gaming.model.singleton;

public class TestingModule implements ITestinModule{
    private static TestingModule instance;
    private TestingModule (){}
    public static TestingModule getInstance(){
        if(instance==null){
            instance= new TestingModule();
        }
        return instance;
    }
    @Override
    public String test() {
        return "Modul testat cu succes.";
    }
}
