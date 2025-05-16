public class CargoPlane extends Airplane {

    private int cargoCapacityKg;



    public CargoPlane(String model, int rangeKm, int cargoCapacityKg) {

        super(model, rangeKm);

        this.cargoCapacityKg = cargoCapacityKg;

    }



    @Override

    public void displayInfo() {

        super.displayInfo();

        System.out.println("Тип: Грузовой");

        System.out.println("Грузоподъёмность: " + cargoCapacityKg + " кг");

    }

}