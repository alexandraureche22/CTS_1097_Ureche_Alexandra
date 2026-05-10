package service.main.singleton;

import service.model.singleton.AMasina;
import service.model.singleton.Masina;
import service.model.singleton.Service;

public class Main {
    public static void main(String[] args) {
        Service service = Service.getInstance();
        Service service1 = Service.getInstance();
        System.out.println("egale?"+(service1==service));
        AMasina masina1 = new Masina("bmw",1200);
        AMasina masina2 = new Masina("audi",374);
        service1.intrareMasina(masina1);
        service1.intrareMasina(masina2);
        service1.iesireMasina();
        service1.intrareMasina(masina2);
        System.out.println(service1.getMasina());
    }
}
