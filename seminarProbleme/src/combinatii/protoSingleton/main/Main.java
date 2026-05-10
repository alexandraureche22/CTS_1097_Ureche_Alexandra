package combinatii.protoSingleton.main;

import combinatii.protoSingleton.FisaMedicala;
import combinatii.protoSingleton.FisaPrototipSingleton;

public class Main {
    public static void main(String[] args) {
        FisaPrototipSingleton fisa1 = FisaPrototipSingleton.getInstance();
        FisaPrototipSingleton fisa2 = FisaPrototipSingleton.getInstance();
        System.out.println("sunt egale"+(fisa1==fisa2));
        FisaMedicala f1 = new FisaMedicala("1A","ureche","blabla");
        fisa1.adauga("alexandra",f1);

        FisaMedicala f2 = fisa1.getFisa("alexandra");
        System.out.println(f1);
        System.out.println(f2);
    }
}
