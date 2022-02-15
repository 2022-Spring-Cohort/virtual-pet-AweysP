package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public VirtualPetApplication() {
    }

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.virtualPetGame();


    }

    private void virtualPetGame() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);
        shelter.createPet(scanner);
        while (true) {
            System.out.println("Here are the commands for you to use:quit, add, feed, wash,play, walk , change oil, charge battery, stats or list ");
            System.out.println("What would you like to do");
            String userInput = scanner.nextLine();

            switch (userInput.strip().toLowerCase()) {
                case "quit":
                    System.exit(0);
                    break;

                case "all stats":
                    System.out.println("Here are all the stats of the pets");
                    shelter.allStats();

                    break;

                case "stats":
                    System.out.println("Which pets stats would you like to look at?");
                    userInput = scanner.nextLine();
                    VirtualPet statsOfPet = shelter.getPets().get(userInput);

                    if (statsOfPet == null) {
                        System.out.println("There is no pet named " + userInput);

                        continue;
                    }
                    System.out.println("Here are the stats for " + userInput);
                    statsOfPet.stats();


                case "add":
                    this.createPet(scanner, shelter);
                    break;
                case "feed":
                    System.out.println("Which pet would you like to feed ?");
                    userInput = scanner.nextLine();
                    VirtualPet fedPet = shelter.getPets().get(userInput);

                    if (fedPet == null) {
                        System.out.println("There is no pet named " + userInput);

                        continue;
                    }
                    fedPet.increasingHunger();
                    System.out.println("You have just fed " + fedPet.getName());

                    break;

                case "feed all pets":
                    shelter.feedAllPets();
                    System.out.println("You have fed all the pets in the shelter");
                    break;


                case "wash":
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }

                    System.out.println("Which pet would you like to clean ?");
                    userInput = scanner.nextLine();
                    VirtualPet cleanedPet = shelter.getPets().get(userInput);

                    if (cleanedPet == null) {
                        System.out.println("There is no pet named " + userInput);

                        continue;

                    }
                    cleanedPet.increasingCleanliness();
                    System.out.println("You have just washed " + cleanedPet.getName());
                    if (cleanedPet instanceof OrganicDog) {
                        OrganicDog petToPutInCage = (OrganicDog) cleanedPet;
                        petToPutInCage.putInCage();
                        System.out.println(cleanedPet.getName() + " was put in the cage");
                    } else if (cleanedPet instanceof OrganicCat) {
                        OrganicCat petToUseLitterBox = (OrganicCat) cleanedPet;
                        petToUseLitterBox.putInLitterBox();
                        System.out.println(cleanedPet.getName() + " used the litter box");

                    }

                    break;


                case "play":
                    if (shelter.getPets().size() == 1) {
                        VirtualPet currentPet = shelter.getPets().get(shelter.getPets().keySet().toArray()[0].toString());
                        currentPet.play();
                        System.out.println("You just played with " + currentPet + "!");
                    }
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    System.out.println("Which pet would you like to play with?");
                    userInput = scanner.nextLine();
                    VirtualPet currentPet = shelter.getPets().get(userInput);

                    if (currentPet == null) {
                        System.out.println("We seem to not have that pet in this shelter");

                        continue;
                    }
                    currentPet.play();
                    System.out.println("You just played with " + currentPet.getName() + "!");
                    break;
                case "walk":
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    System.out.println("Which pet would you like to walk ?");
                    userInput = scanner.nextLine();
                    VirtualPet walkedPet = shelter.getPets().get(userInput);

                    if (walkedPet == null) {
                        System.out.println("There is no pet named " + userInput);

                        continue;
                    }
                    walkedPet.walkingTheDog();
                    System.out.println("You have just walked " + walkedPet.getName());

                    break;

                case "change oil":
                    System.out.println("Which pet would you like to change the oil to ?");
                    userInput = scanner.nextLine();
                    VirtualPet oilChanged = shelter.getPets().get(userInput);

                    if (oilChanged == null) {
                        System.out.println("There is no pet named " + userInput);
                        continue;
                    }
                    if (oilChanged instanceof Robots) {
                        Robots petToOil = (Robots) oilChanged;
                        petToOil.changingTheOil();
                        System.out.println("You have just changed the oil of " + petToOil.getName());
                    } else {
                        System.out.println("You cannot change the oil of an organic pet!!!");
                    }
                    break;

                case "charge battery":
                    System.out.println("Which pet would you like to charge ?");
                    userInput = scanner.nextLine();
                    VirtualPet chargedPet = shelter.getPets().get(userInput);

                    if (chargedPet == null) {
                        System.out.println("There is no pet named " + userInput);
                        continue;
                    }
                    if (chargedPet instanceof Robots) {
                        Robots petToCharge = (Robots) chargedPet;
                        petToCharge.chargingTheBattery();
                        System.out.println("You have just charged the battery for  " + petToCharge.getName());
                    } else {
                        System.out.println("You cannot charge the batter of an organic pet!!");
                    }
                    break;


                case "help ":
                    System.out.println("Here are the commands for you to use:quit, adopt, feed, wash,play,or list ");
                    break;

                case "list":
                    System.out.println("Here is a list of all the pets we currently have ");
                    for (VirtualPet pet : shelter.getPets().values()) {
                        System.out.println(pet);
                    }
                    continue;

                default:
                    System.out.println("We don't know that command, please try again");
            }
            shelter.tickPets();
        }


    }


    public void createPet(Scanner scanner, VirtualPetShelter shelter) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("lets create your pet !!");

        System.out.println("Would you like an organic pet or a robotic pet?");
        String petType = userInput.nextLine();
        VirtualPet userPet = null;
        if (petType.equalsIgnoreCase("organic")) {
            System.out.println("Enter organic pet's name");
            String name = userInput.nextLine();
            System.out.println("Enter organic pet's age");
            int age = userInput.nextInt();
            userInput.nextLine();
            System.out.println("Enter organic pet's color");
            String color = userInput.nextLine();
            System.out.println("Enter organic pet's hunger level up to 10");
            int hunger = userInput.nextInt();
            if (hunger > 10) {
                hunger = 10;
            }
            userInput.nextLine();
            System.out.println("Enter organic pet's stamina level up to 10");
            int stamina = userInput.nextInt();
            if (stamina > 10) {
                stamina = 10;
            }
            userInput.nextLine();
            System.out.println("Enter organic pet's cleanliness level up to 10");
            int cleanliness = userInput.nextInt();
            if (cleanliness > 10) {
                cleanliness = 10;
            }
            userInput.nextLine();
            System.out.println("Is the organic pet asleep ( true or false )");
            boolean sleeping = userInput.nextBoolean();
            if (sleeping) {
                stamina = 0;
            }
            System.out.println("Is " + name + " a cat or a dog?");
            String organicPetType = "";
            while (!organicPetType.equals("dog") && !organicPetType.equals("cat")) {
                organicPetType = userInput.nextLine();
                if (organicPetType.equalsIgnoreCase("dog")) {
                    userPet = new OrganicDog(name, age, color, hunger, stamina, cleanliness, sleeping, false);
                } else if (organicPetType.equalsIgnoreCase("cat")) {

                    userPet = new OrganicCat(name, age, color, hunger, stamina, cleanliness, sleeping, false);
                }
            }
            System.out.println(name + " was added to the shelter");
            shelter.addPetToShelter(userPet);
        } else if (petType.equalsIgnoreCase("robotic")) {
            System.out.println("Enter robotic pet's name");
            String name = userInput.nextLine();


            System.out.println("Is this a dog or cat?");
            String roboticPetType = userInput.nextLine();
            if (roboticPetType.equalsIgnoreCase("dog")) {
                userPet = new RoboticDog(name, 0, 50, true, 8, 50);
            } else if (roboticPetType.equalsIgnoreCase("cat")) {
                userPet = new RoboticCat(name, 50, 0, true, 9, 50);

            }
            System.out.println(name + " was added to the shelter");
            shelter.addPetToShelter(userPet);

        }

    }

}








