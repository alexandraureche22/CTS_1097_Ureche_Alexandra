package transport.singleton.main;

import transport.singleton.Dispecerata;

public class Main {
    public static void main(String[] args) {
        Dispecerata dispecerata1 = Dispecerata.getInstance();
        Dispecerata dispecerata2 = Dispecerata.getInstance();
        System.out.println("sunt la fel? "+ (dispecerata2==dispecerata1));
        Thread thread = new Thread(()->{
            Dispecerata dispecerata3 =Dispecerata.getInstance();
        });
        thread.start();
        dispecerata1.incepesCursa("buc-iasi");
        dispecerata1.incepesCursa("cluj-sibiu");
        dispecerata1.finalizeazaCursa();
        dispecerata1.incepesCursa("chisinau-targu frumos");
        dispecerata1.getCursaActiva();
    }
}
