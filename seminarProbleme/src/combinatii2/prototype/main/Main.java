package combinatii2.prototype.main;

import combinatii2.prototype.Card;
import combinatii2.prototype.CardSingleton;

public class Main {
    public static void main(String[] args) {
        CardSingleton cardSingleton = CardSingleton.getInstance();
        Card c1 = new Card("premium", "ureche", "student");
        cardSingleton.adaugaCard("primul",c1);
        Card c2 = cardSingleton.getCard("ureche");
        if (c2 != null) {
            c2.setNumeCititor("marius");

        }
        System.out.println(c1);
        System.out.println(c2);
    }
}
