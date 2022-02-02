package virtual_pet;

public class RoboCat extends Robots {

    public RoboCat(String name) {
        super(name);
        type = "Robotic Cat";
    }

    @Override
    public void changeOil() {
        oilLevel += 20;
    }
}
