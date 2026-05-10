package adapter.hotel;

public class HotelAdapter implements IHotel{
    private HotelVechi hotelVechi;

    public HotelAdapter(HotelVechi hotelVechi) {
        this.hotelVechi = hotelVechi;
    }

    @Override
    public void rezervaOnline() {
        System.out.println("Camera rezervata prin adapter.");
        this.hotelVechi.rezervaCamera();

    }
}
