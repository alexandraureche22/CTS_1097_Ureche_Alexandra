package combinatii2.prototype;

import java.util.HashMap;
import java.util.Map;

public class CardSingleton{
    private Map<String, Card> carduri = new HashMap<>();
    private static CardSingleton instance;

    public static CardSingleton getInstance(){
        if(instance == null){
            instance= new CardSingleton();
        }
        return instance;
    }

    private CardSingleton() {
    }
    public void adaugaCard(String nume,Card card){
        carduri.put(nume,card);
    }
    public Card getCard(String nume){
        if(carduri.containsKey(nume)){
            return carduri.get(nume).cloneaza();
        }
        return null;
    }
}
