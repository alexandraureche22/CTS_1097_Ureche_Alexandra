package combinatii2.factoryMethod.main;

import combinatii2.factoryMethod.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MemorieFactory m = MemorieFactory.getInstance();
        StocareFactory s = StocareFactory.getInstance();

        Stocare elem1 = m.creeaza(EMemorie.RAM_DDR4,"nu stiu",100);
        Stocare elem2 = m.creeaza(EMemorie.RAM_DDR5,"ceva",200);
        Stocare elem3 = s.creeaza(EStocare.SDD,"inca ceva",200);
        Stocare elem4 = s.creeaza(EStocare.HDD,"CEVA RAU ceva",237);
        elem1.afiseaza();
        elem2.afiseaza();
        elem3.afiseaza();
        elem4.afiseaza();
    }
}
