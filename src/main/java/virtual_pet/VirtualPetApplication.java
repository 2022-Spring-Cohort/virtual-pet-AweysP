package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    //private VirtualPet simbaPet = new VirtualPet("Simba",2,"black",10,10,0,true);

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.virtualPetGame();
    }

    private void virtualPetGame() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("lets create your pet for you first");
        boolean playGame = true;
        System.out.println("Enter Pet name");
        String name = userInput.nextLine();
        System.out.println("Enter Pet age");
        int age = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter Pet color");
        String color = userInput.nextLine();
        System.out.println("Enter Pet's hunger level up to 10");
        int hunger = userInput.nextInt();
        if (hunger > 10) {
            hunger = 10;
        }
        userInput.nextLine();
        System.out.println("Enter Pet's stamina level up to 10");
        int stamina = userInput.nextInt();
        if (stamina > 10) {
            stamina = 10;
        }
        userInput.nextLine();
        System.out.println("Enter Pet's cleanliness level up to 10");
        int cleanliness = userInput.nextInt();
        if (cleanliness > 10) {
            cleanliness = 10;
        }
        userInput.nextLine();
        System.out.println("Is the Pet asleep ( true or false )");
        boolean sleeping = userInput.nextBoolean();
        if (sleeping) {
            stamina = 0;
        }

        VirtualPet userPet = new VirtualPet(name, age, color, hunger, stamina, cleanliness, sleeping);

        System.out.println("Now that you have created your pet lets go over the instructions \nPress 1 to play with " + userPet.getName() + "\nPress 2 to feed " + userPet.getName() +
                "\nPress 3 to clean " + userPet.getName() + "\nPress 0 to quit the interactions");
        int input = userInput.nextInt();
        String userChoice = userInput.nextLine();

        while (playGame) {
            if (input > 3 || input < 0) {
                System.out.println("Please enter a valid number between 0 and 3");
            }
            if (input == 0) {
                System.out.println("Game has ended");
                playGame = false;
            }
            if (input == 1) {
                System.out.println("You just played with " + name);
                userPet.decreasingStamina();
                userPet.decreasingHunger();
                userPet.decreasingCleanliness();
                System.out.println("Pet's stamina is now " + userPet.getStamina());
                System.out.println("Pet's hunger is now " + userPet.getHunger());
                System.out.println("Pet's cleanliness is now " + userPet.getCleanliness());
            } else if (input == 2) {
                System.out.println("You just fed " + userPet.getName());
                userPet.increasingHunger();
                userPet.increasingStamina();
                System.out.println("Pet's stamina is now " + userPet.getStamina());
                System.out.println("Pet's hunger is now " + userPet.getHunger());
                System.out.println("Pet's cleanliness is now " + userPet.getCleanliness());

            } else if (input == 3) {
                System.out.println("You just gave " + userPet.getName() + " a bath");
                userPet.increasingCleanliness();
                System.out.println("Pet's stamina is now " + userPet.getStamina());
                System.out.println("Pet's hunger is now " + userPet.getHunger());
                System.out.println("Pet's cleanliness is now " + userPet.getCleanliness());
            }
            System.out.println("Do you want to continue with " + userPet.getName());
            System.out.println(" Yes or no ?");
            userInput.nextLine();
            if (userChoice.equalsIgnoreCase("yes")) {
                stamina = userInput.nextInt();
                hunger = userInput.nextInt();
                cleanliness = userInput.nextInt();
            }


        }


    }

}
