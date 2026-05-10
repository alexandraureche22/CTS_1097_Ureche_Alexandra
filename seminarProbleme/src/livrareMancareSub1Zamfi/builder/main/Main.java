package livrareMancareSub1Zamfi.builder.main;

import livrareMancareSub1Zamfi.builder.Comanda;
import livrareMancareSub1Zamfi.builder.ComandaBuilder;
import livrareMancareSub1Zamfi.builder.IComanda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new ComandaBuilder().setAdresa("strd maicuta").setEmail("ureche@gmail.com")
                .setTelefon("0767676767").build();
        Comanda c2=new ComandaBuilder().setMetodaPlata("card").setProduse(List.of("lapte","oua"))
                .build();
        System.out.println(c2);
        System.out.println(c1);

    }
}
