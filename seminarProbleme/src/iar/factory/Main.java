package iar.factory;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonalSpitalFactory personalSpitalFactory = PersonalSpitalFactory.getInstance();
        PersonalSpital p1 = personalSpitalFactory.creeaza(Tip.MEDIC,"URreche Alexnuta",5);
        PersonalSpital p3 =personalSpitalFactory.creeaza(Tip.ASISTENT,"Sescu Denis",2);
        PersonalSpital p2 = personalSpitalFactory.creeaza(Tip.BRANCARDIER,"Vasile Ana",4);
        p1.afiseazaOcupatia();
        p2.afiseazaOcupatia();
        p3.afiseazaOcupatia();
        Thread thread= new Thread(()->{
            PersonalSpitalFactory personalSpitalFactory1 = PersonalSpitalFactory.getInstance();
            PersonalSpital p4 = null;
            try {
                p4 = personalSpitalFactory1.creeaza(Tip.ASISTENT,"marius",2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            p4.afiseazaOcupatia();
        });
        thread.start();
    }
}
