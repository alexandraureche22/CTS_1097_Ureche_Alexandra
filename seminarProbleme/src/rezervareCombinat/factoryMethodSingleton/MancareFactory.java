package rezervareCombinat.factoryMethodSingleton;

public abstract class MancareFactory {
    public abstract FelDeMancare creeaza(TipMancare tip, String denumire) throws Exception;
}
