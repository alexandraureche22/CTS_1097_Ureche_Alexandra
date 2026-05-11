package facade.restaurant;

public class Servetele {
    private boolean suntServetele;

    public Servetele(boolean suntServetele) {
        this.suntServetele = suntServetele;
    }
    public boolean suntServeteleLaMasa(){
        if(suntServetele){
            System.out.println("Sunt puse servetele la masa.");
            return true;

        }
        else{
            System.out.println("Nu sunt puse servetele la masa.");
            return false;
        }
    }
}
