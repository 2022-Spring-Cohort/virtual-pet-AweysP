package virtual_pet;

public class OrganicDog extends Organic {


    private int walkDog;

    public OrganicDog(String name, int age, String color, int hunger, int stamina, int cleanliness, boolean sleeping, boolean needsToPoop) {
        super(name, age, color, hunger, stamina, cleanliness, sleeping, needsToPoop);
        type = "Dog";


    }

    public void putInCage() {
        this.needsToPoop = false;
    }

    public int getWalkDog() {
        return walkDog;
    }

    public void setWalkDog(int walkDog) {
        this.walkDog = walkDog;
    }

    @Override
    public String toString() {
        return super.toString() + "\n    Exercise: " + getWalkDog();
    }

    public void walkTheDog() {


    }


}
