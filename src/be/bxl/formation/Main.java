package be.bxl.formation;
import be.bxl.formation.models.Animal;
import be.bxl.formation.models.Chat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chat chat = new Chat("Clochette",3, "F", "26/09/82", "calin", "coupée", "long");
        System.out.println(chat.presentationAnimal());
        chat.crier("Miaouuuu MIAOUUUUU !!!!");
    }
}
