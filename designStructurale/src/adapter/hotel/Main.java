package adapter.hotel;

import java.util.List;

public class Main {
    static void main() {
        HotelVechi hotelVechi = new HotelVechi("bucuresti");
        IHotel iHotel = new HotelNou();
        IHotel iHotel1 = new HotelAdapter(hotelVechi);
        List<IHotel> hoteluri = List.of(iHotel,iHotel1);
        hoteluri.forEach(IHotel::rezervaOnline);
    }
}
