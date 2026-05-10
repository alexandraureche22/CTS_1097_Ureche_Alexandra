package aperativ.main;

import aperativ.AAperitiv;
import aperativ.ABucatarieFactory;
import aperativ.Italiana;
import aperativ.Mexicana;

public class Main {
    public static void main(String[] args) {
        ABucatarieFactory bucItaliana = new Italiana();
        ABucatarieFactory bucMexicana = new Mexicana();

        AAperitiv a1 = bucItaliana.creeaza("briosa","lapte, oua");
    }
}
