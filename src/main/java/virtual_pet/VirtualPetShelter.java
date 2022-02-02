package virtual_pet;

import java.util.HashMap;
import java.util.Scanner;

public class VirtualPetShelter {

   private static final HashMap<String,VirtualPet> pets = new HashMap<>();

   public  HashMap<String, VirtualPet> getPets(){
       return pets;
   }



    public void feedAllPets(){
       for(VirtualPet pet : this.getPets().values()){
           pet.increasingHunger();
           }

    }
    public void tickPets(){
       for(VirtualPet pet: getPets().values()){
           pet.tick();
       }
    }

    public void createPet(Scanner scanner1) {
    }

    public void addPetToShelter(VirtualPet pet){
       this.pets.put(pet.getName(), pet);

    }
    public void allStats() {
        for (VirtualPet pet : this.getPets().values()) {
            pet.stats();
        }
    }

    public VirtualPetShelter() {
        VirtualPet frosty = new VirtualPet("Frosty", 3, "white", 7, 4, 8, false);
        VirtualPet speedy = new VirtualPet("Speedy", 5, "orange", 7, 8, 3, false);
        VirtualPet shacks = new VirtualPet("Shacks", 1, "black/white", 4, 8, 7, true);
        pets.put("frosty",frosty);
        pets.put("speedy",speedy);
        pets.put("shacks",shacks);

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

    }
}

