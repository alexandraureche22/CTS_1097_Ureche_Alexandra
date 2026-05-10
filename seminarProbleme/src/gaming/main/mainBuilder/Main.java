package gaming.main.mainBuilder;

import gaming.model.builder.GamingSystem;
import gaming.model.builder.GamingSystemBuilder;

public class Main {
    public static void main(String[] args) {
        GamingSystem g1 = new GamingSystemBuilder("p102","160","intel","auc")
                .setScaunGaming("alpha").setCasti("sony").setMouse("tech").build();
        GamingSystem g2 = new GamingSystemBuilder("p83","200","intel","teco")
                .setTastatura("core").setScaunGaming("pro max").build();
        g1.print();
        g2.print();
    }
}
