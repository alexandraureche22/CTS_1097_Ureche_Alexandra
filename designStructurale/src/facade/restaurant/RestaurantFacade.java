package facade.restaurant;

public class RestaurantFacade {
    private Masa masa;
    private Curatenie curatenie;
    private Servetele servetele;

    public RestaurantFacade(Masa masa, Curatenie curatenie, Servetele servetele) {
        this.masa = masa;
        this.curatenie = curatenie;
        this.servetele = servetele;
    }
    public void pregatesteMasa(){
        if(!masa.verificaDacaMasaEsteLibera()){
            System.out.println("Nu se poate pregati masa. Masa nu este libera.");
            return;
        }
        if(!curatenie.esteMasaDebarasata()){
            System.out.println("Nu se poate debarasa masa. Masa ocupata.");
            return;
        }
        if(!servetele.suntServeteleLaMasa()){
            System.out.println("Nu sunt servetele la masa.");
            return;
        }
        System.out.println("masa este pregatita. clientul poate fi asezat la masa.");
    }
}
