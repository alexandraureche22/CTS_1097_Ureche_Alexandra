package facade.transport;

public class UsiFacade {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public UsiFacade(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void puneToateUsileInModLiber(){
        System.out.println("Usile in mod liber.");
        usaFata.puneInModLiber();
        usaMijloc.puneInModLiber();
        usaSpate.puneInModLiber();
    }
    public void toateUsileSuntFortate(){
        System.out.println("Usile sunt fortate.");
        usaFata.deschidereFortata();
        usaMijloc.deschidereFortata();
        usaSpate.deschidereFortata();
    }
}
