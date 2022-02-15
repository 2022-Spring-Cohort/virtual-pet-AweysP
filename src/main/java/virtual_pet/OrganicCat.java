package virtual_pet;

public class OrganicCat extends Organic {

    public OrganicCat(String name, int age, String color, int hunger, int stamina, int cleanliness, boolean sleeping, boolean needsToPoop) {
        super(name, age, color, hunger, stamina, cleanliness, sleeping, needsToPoop);
        type = "Cat";
    }

    public void putInLitterBox() {
        this.needsToPoop = false;
    }

    @Override
    public void walkingTheDog() {
    }


}