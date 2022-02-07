package virtual_pet;

public class RoboDog extends Robots {

    public RoboDog(String name) {
        super(name);
        type = "Robotic Dog";
    }

    public void walkTheDog() {
        oilLevel -= 10;

        batteryLevel -= 10;
    }

    @Override
    public void changeOil() {
        oilLevel += 30;
    }
}
