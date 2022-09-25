package adapter;

public class Main {
    public static void main(String[] args) {
        UsaCharger socket = new UsaCharger();
        socket.chargeUsaPhone();
        UsaCharger usaChargerAdaper = new ChargerAdapter(new RomanianCharger());
        usaChargerAdaper.chargeUsaPhone();
    }
}
