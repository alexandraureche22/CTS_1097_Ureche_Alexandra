package eveniment.main.prototype;

import eveniment.model.prototype.Contract;
import eveniment.model.prototype.RegistruContracte;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RegistruContracte registruContracte = RegistruContracte.getInstance();
        Contract c1 = new Contract("multe clauze rau");
        Contract c2 = new Contract("clauze clauze clauze");
        c1.setNume("alexandra stefana ioana");
        c1.setPret(222);
        Contract c3 = c1.clone();
        c3.setNume("maria ioana");
        c3.setPret(100);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println("=====");
        registruContracte.adaugaContract("standard",c1);
        registruContracte.adaugaContract("standard",c2);
        registruContracte.adaugaContract("premium",c3);
        System.out.println(registruContracte.getContract("standard"));
    }
}
