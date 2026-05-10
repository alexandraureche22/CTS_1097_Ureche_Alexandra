package restaurant.builder.main;

import restaurant.builder.Meniu;
import restaurant.builder.MeniuBuilder;

public class Main {
    public static void main(String[] args) {
        Meniu meniu1 = new MeniuBuilder("zi de nastere",12).setAperitivAles("platou branzeturi")
                .setDesert("eclere").setBautura("suc de portocale").setServireMasa(true).build();
        Meniu meniu2 = new MeniuBuilder("nunta",230).setFelPrincipal("sarmale").setDesert("tort")
                .setIncludeDecoratiuni(true).setBautura("vin").build();
        Meniu meniu3 = new MeniuBuilder("absolvire",100).setDesert("briose").setBautura("sucuri").build();
        meniu3.afiseazaMeniu();
        meniu2.afiseazaMeniu();
        meniu1.afiseazaMeniu();
    }
}
