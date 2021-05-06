package be.bxl.formation;
import be.bxl.formation.models.Animal;
import be.bxl.formation.models.Chat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chat chat = new Chat("Clochette", "F", "26/09/82", "calin", "coupée", "long");
        System.out.println(chat.presentationAnimal());
    }
}
