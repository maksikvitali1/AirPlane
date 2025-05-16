public class MilitaryPlane extends Airplane {

    private String weaponType;



    public MilitaryPlane(String model, int rangeKm, String weaponType) {

        super(model, rangeKm);

        this.weaponType = weaponType;

    }



    @Override

    public void displayInfo() {

        super.displayInfo();

        System.out.println("Тип: Военный");

        System.out.println("Вооружение: " + weaponType);

    }

}


