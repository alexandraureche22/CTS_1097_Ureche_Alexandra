package adapter.hotel;

public class HotelVechi {
    private String nume;

    public HotelVechi(String nume) {
        this.nume = nume;
    }
    public void verificaDisponibilitatea(){
        System.out.println("Se verifica disponibilitatea camerelor hotelului "+this.nume);
    }
    public void rezervaCamera(){
        verificaDisponibilitatea();
        System.out.println("Cmaera rezervata dupa ce s a verificat disponibilitatea.");
    }
}
