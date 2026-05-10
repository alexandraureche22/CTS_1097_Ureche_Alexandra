package adapter.hotel;

public class HotelNou implements IHotel{
    @Override
    public void rezervaOnline() {
        System.out.println("Camera rezervata online fara sa se verifice disponibilitatea.");
    }
}
