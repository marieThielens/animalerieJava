package be.bxl.formation.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animalerie {
    private String nom;
    private ArrayList<Animal> animaux;
    private int nbChat;
    private int nbChien;

    // getters
    public String getNom() { return nom; }
    // unmodifiableList permet de retourner une collection en "read-only"
    public List<Animal> getAnimaux() {
        return Collections.unmodifiableList(animaux);
    }

    public int getNbChat() { return nbChat; }
    public int getNbChien() { return nbChien; }

    // setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    // constructeur
    public Animalerie(String nom) {
        this.setNom(nom);
        this.nbChat = 0;
        this.nbChien = 0;
        this.animaux = new ArrayList<>();
    }

    //region Méthode
    private void updateNombreAnimaux(Animal animal, int modificateur) {
        if (animal instanceof Chat)
            nbChat += modificateur;
        else if (animal instanceof Chien)
            nbChien += modificateur;
        else
            throw new RuntimeException("Type d'animal non supporté !!!");
    }

    public void ajouterAnimal(Animal animal) {
        if (animal == null || !animal.isVivant())
            throw new IllegalArgumentException("Parametre Animal non valide!");

        // Ajout dans la liste
        this.animaux.add(animal);

        // Mise a jours du compteur
        updateNombreAnimaux(animal, 1);
    }

    public void retirerAnimal(Animal animal) {
        if (animal == null)
            throw new IllegalArgumentException("Parametre Animal non valide!");

        // Suppression dans la liste
        boolean ok = this.animaux.remove(animal);

        if (ok) {
            // Mise a jours du compteur
            updateNombreAnimaux(animal, -1);
        }
    }

    public void retirerAnimauxdecede() {
        int indexMax = this.animaux.size() - 1;

        for (int i = indexMax; i >= 0; i--) {
            Animal a = this.animaux.get(i);

            if (!a.isVivant()) {
                retirerAnimal(a);
            }
        }
    }
}
