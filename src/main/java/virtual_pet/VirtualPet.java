package virtual_pet;

public class VirtualPet {

    private String name;
    private int age;
    private String color;
    private int hunger;
    private int stamina;
    private int cleanliness;
    private boolean sleeping;

    public VirtualPet(String name, int age, String color, int hunger, int stamina, int cleanliness, boolean sleeping) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hunger = hunger;
        this.stamina = stamina;
        this.cleanliness = cleanliness;
        this.sleeping = sleeping;

    }

    public VirtualPet(String name) {
       this.name = name;
    }

//    public VirtualPet () {
//        this.name = "Simba";
//    }





    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHunger() {
        return hunger;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void  increasingHunger() {
         hunger += 2;
         hunger = Math.min(10,hunger);
    }

    public void decreasingHunger() {
        hunger -= 1;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void increasingStamina() {
         stamina += 2;
         stamina = Math.min(10,stamina);

    }

    public void decreasingStamina() {
        stamina -= 2;
        if (stamina < 0) {
            stamina = 0;
        }

    }

    public void increasingCleanliness() {
        cleanliness += 2;
         cleanliness = Math.min(10,cleanliness);


    }

    public void decreasingCleanliness() {
        cleanliness -= 1;
        if (cleanliness < 0) {
            cleanliness = 0;
        }

    }

    public void tick() {
        increasingHunger();
        decreasingHunger();
        increasingStamina();
        decreasingStamina();
        increasingCleanliness();
        decreasingCleanliness();
    }

    public void play(){
        decreasingHunger();
        decreasingStamina();
        decreasingCleanliness();
    }
    public void stats(){
        System.out.println(getName() + "'s hunger is " + getHunger());
        System.out.println(getName() + "'s stamina is " + getStamina());
        System.out.println(getName() + "'s cleanliness is " +getCleanliness());
    }

    @Override
    public String toString() {
        return "name " +name +"  : age " + age;
    }
}
