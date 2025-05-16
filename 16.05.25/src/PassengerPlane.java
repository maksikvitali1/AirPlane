public class PassengerPlane extends Airplane {

    private int passengerCapacity;



    public PassengerPlane(String model, int rangeKm, int passengerCapacity) {

        super(model, rangeKm);

        this.passengerCapacity = passengerCapacity;

    }



    @Override

    public void displayInfo() {

        super.displayInfo();

        System.out.println("Тип: Пассажирский");

        System.out.println("Пассажировместимость: " + passengerCapacity);

    }

}
