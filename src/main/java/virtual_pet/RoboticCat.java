package virtual_pet;

public class RoboticCat extends Robots {


    public RoboticCat(String name, int oilLevel, int age, boolean poweredOn, int cleanliness, int batteryLevel) {
        super(name, oilLevel, age, poweredOn, cleanliness, batteryLevel);
    }


    @Override
    public void changingTheOil() {
        oilLevel += 10;
    }

    @Override
    public void walkingTheDog() {
    }
}
