package banking.factory.main;

import banking.factory.Account;
import banking.factory.ContFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Account account1 = ContFactory.creeaza("economii","ureche22",2500);
        Account account2 = ContFactory.creeaza("depozit","ana12",1000);
        Account account3 = ContFactory.creeaza("curent","denis31",3500);
        Account account4 = ContFactory.creeaza("economii","rock21",10000);
        account1.afiseazaDetalii();
        account2.afiseazaDetalii();
        account3.afiseazaDetalii();
        account4.afiseazaDetalii();
    }
}
