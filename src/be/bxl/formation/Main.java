package be.bxl.formation;
import be.bxl.formation.models.Animal;
import be.bxl.formation.models.Chat;
import be.bxl.formation.models.Chien;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // region chat
        Chat clochette = new Chat("Clochette",3.5, "F", "26/09/2020", "calin", "coupée", "long");
        Chat souris = new Chat("Souris",3.2, "F", "26/10/2020", "Timide", "tranchante", "court");

        ArrayList<Animal> chats = new ArrayList<>();
        chats.add(clochette);
        chats.add(souris);

        for (Animal a : chats) {
            System.out.println(a.presentationAnimal());
            a.crier("Miaouuuu MIAOUUUUU !!!!");
            // a.estVivant();
        }
        // endregion

        // region chien
        Chien Rantanlan = new Chien("Rantanplan", 5.9, "M", "13/06/2021", "rouge", "caniche", true);
        // endregion

        // System.out.println(chat.presentationAnimal());
        // chat.crier("Miaouuuu MIAOUUUUU !!!!");
    }
}
