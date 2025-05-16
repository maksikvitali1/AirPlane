public class Airplane {

    protected String model;

    protected int rangeKm;



    public Airplane(String model, int rangeKm) {

        this.model = model;

        this.rangeKm = rangeKm;

    }



    public void displayInfo() {

        System.out.println("Модель: " + model);

        System.out.println("Дальность полёта: " + rangeKm + " км");

    }

}