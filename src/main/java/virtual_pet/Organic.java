package virtual_pet;

public abstract class Organic extends VirtualPet {

    protected boolean needsToPoop;

    protected String type;

    public Organic(String name, int age, String color, int hunger, int stamina, int cleanliness, boolean sleeping, boolean needsToPoop) {
        super(name, age, color, hunger, stamina, cleanliness, sleeping);

        this.needsToPoop = needsToPoop;
    }


    public boolean isNeedsToPoop() {
        if (getHunger() >= 8) {
            this.needsToPoop = true;
        } else {
            this.needsToPoop = false;
        }
        return needsToPoop;
    }


    public Organic(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + ":" +
                "\n    Type: " + getType() +
                "\n    Age: " + getAge() +
                "\n    Color: " + getColor() +
                "\n    Hunger: " + getHunger() +
                "\n    Stamina: " + getStamina() +
                "\n    Desire to defecate:  " + isNeedsToPoop();

    }

}
