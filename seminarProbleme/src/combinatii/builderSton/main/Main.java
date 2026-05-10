package combinatii.builderSton.main;

import combinatii.builderSton.Card;
import combinatii.builderSton.CardBuilder;

public class Main {
    public static void main(String[] args) {
        CardBuilder card1 = CardBuilder.getInstance();
        CardBuilder card2 = CardBuilder.getInstance();
        System.out.println("egale?"+(card2==card1));
        Card c1 = card1.setAreAccesVIP(true).setAreAsigurare(true).setLimitaCredit(200).build();
        Card c2 = card1.setAreAccesVIP(true).setDesign("mov cu sclipici").setLimitaCredit(12000).build();
        System.out.println(c1);
        System.out.println(c2);
        Thread thread = new Thread(()->{
            CardBuilder card3 = CardBuilder.getInstance();
            System.out.println("egale?"+(card1==card3));
        });
        thread.start();
    }
}
