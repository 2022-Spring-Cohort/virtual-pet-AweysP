package virtual_pet;

public class RoboticDog extends Robots {

    public RoboticDog(String name, int age, int oilLevel, boolean poweredOn, int cleanliness, int batteryLevel) {
        super(name, age, oilLevel, poweredOn, cleanliness, batteryLevel);
        //type = "Robotic Dog";
    }


    public boolean isNeedsOil() {
        return super.isNeedsOil();
    }

    public void walkTheDog() {
        oilLevel -= 5;

        batteryLevel -= 5;
    }

    @Override
    public void changingTheOil() {
        oilLevel += 10;
    }
}
