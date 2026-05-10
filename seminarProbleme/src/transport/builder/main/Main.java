package transport.builder.main;

import transport.builder.AutobuzBuilder;
import transport.builder.AutobuzLinie;
import transport.builder.IAutobuz;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new AutobuzBuilder("audi").setSofer("ureche").setAreOpriri(true).setCapatLinie("bragadiru")
                .setDeschidereUsiAutomat(true).build();
        AutobuzLinie a2 = new AutobuzBuilder("bmw").setAreOpriri(true).setCapatLinie("preciziei").setSofer("denis")
                .setTextEcran("urmatoarea oprire piata presei").build();
        System.out.println(a1);
        System.out.println(a2);
    }
}
