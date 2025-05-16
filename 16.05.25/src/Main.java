public class Main {

    public static void main(String[] args) {

        PassengerPlane pPlane = new PassengerPlane("Airbus A320", 6150, 180);

        CargoPlane cPlane = new CargoPlane("Boeing 747 Cargo", 9800, 137000);

        MilitaryPlane mPlane = new MilitaryPlane("F-16 Falcon", 4220, "ракеты и пушки");



        pPlane.displayInfo();

        System.out.println();

        cPlane.displayInfo();

        System.out.println();

        mPlane.displayInfo();

    }

}