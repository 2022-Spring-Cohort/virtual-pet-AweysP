package virtual_pet;

import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

    private HashMap<String, VirtualPet> pets = new HashMap<>();

    public VirtualPetShelter() {

        pets.put("frosty", new OrganicCat("Frosty", 3, "white", 7, 4, 8, false, false));
        pets.put("speedy", new RoboticCat("Speedy", 5, 50, true, 10, 50));
        pets.put("shacks", new OrganicDog("Shacks", 1, "black/white", 4, 8, 7, true, false));
        pets.put("trunks", new RoboticDog("Trunks", 5, 50, true, 10, 50));
    }

    public HashMap<String, VirtualPet> getPets() {
        return pets;
    }


    public void feedAllPets() {
        for (VirtualPet pet : this.getPets().values()) {
            pet.increasingHunger();
        }

    }

    public void tickPets() {
        for (VirtualPet pet : getPets().values()) {
            pet.tick();
        }
    }

    public void createPet(Scanner scanner1) {
    }

    public void addPetToShelter(VirtualPet pet) {
        this.pets.put(pet.getName(), pet);

    }

    public void allStats() {
        for (VirtualPet pet : this.getPets().values()) {
            pet.stats();
        }
    }


//    public VirtualPet adoptPet(String name) {
//                    VirtualPet petToRemove = null;
//                    for (VirtualPet pet : this.allPets) {
//                        if (pet.getName().equals(name)) {
//                            petToRemove = pet;
//
//            }
//        }
//        this.allPets.remove(petToRemove);
//        return petToRemove;

//}
}

