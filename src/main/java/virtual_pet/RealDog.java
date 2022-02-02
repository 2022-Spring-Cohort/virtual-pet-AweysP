package virtual_pet;

public class RealDog extends Organic {


    private int walkDog;

    public RealDog(String name) {
        super(name);
        type = "Dog";
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

        walkDog += 4;

        System.out.println("You walked " + getName());

    }


}
