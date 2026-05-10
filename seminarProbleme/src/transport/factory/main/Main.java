package transport.factory.main;

import transport.factory.IMijloc;
import transport.factory.MijlocFactory;
import transport.factory.MijlocTRansport;

public class Main {
    public static void main(String[] args) throws Exception {
        IMijloc tr1 = MijlocFactory.creeaza(MijlocTRansport.TRAMVAI,"B-101-STB",56);
        IMijloc tr2 = MijlocFactory.creeaza(MijlocTRansport.AUTOBUZ,"IS-22-ALX",52);
        IMijloc tr3 = MijlocFactory.creeaza(MijlocTRansport.TRAMVAI,"SV-21-ROK",30);
        tr1.afiseaza();
        tr2.afiseaza();
        tr3.afiseaza();
    }

}
