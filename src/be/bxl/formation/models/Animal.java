package be.bxl.formation.models;
import be.bxl.formation.helpers.FaireRandom;

public abstract class Animal {

    // region champ
    private String nom;
    private double poids;
    private int tailleCm;
    private String sexe;
    private int age;
    private String dateArrivee;
    private double probDeces;
    private boolean vivant;
    // endregion

    // region encapsulation alt + insert pour générer automatiquement
    public String getNom(){
        return nom;
    }
    public double getPoids(){
        return poids;
    }
    public int getTailleCm(){
        return tailleCm;
    }
    public int getAge() {
        return age;
    }
    public String getSexe() {
        return sexe;
    }
    public String getDateArrivee() {
        return dateArrivee;
    }
    public boolean isVivant() {return vivant; }
    // abstract. On ne sais pas encore
    protected abstract double getProbDeces();

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    public void setPoids(double poids){ this.poids = poids; }
    public void setDateArrivee(String dateArrivee){
        this.dateArrivee = dateArrivee;
    }

    // endregion
    public String presentationAnimal(){
        return getNom() + " pèse " + getPoids() + " kg . C'est un animal de sexe " + getSexe() + " Est arrivé en date du " + getDateArrivee();
    }

    // region constructeur
    public Animal(String nom, double poids, String sexe, String dateArrivee ){
        this.setNom(nom);
        this.setPoids(poids);
        this.setSexe(sexe);
        this.setDateArrivee(dateArrivee);
        this.vivant = true;
    }

    // Connait la methode mais ne sais pas encore ce qu'elle doit crier,
    // c'est l'enfant qui va le dire . il faut mettre abstract aussi en haut
    public abstract void crier();

    public void estVivant() {
        // envoie une valeur de 0 à 1 x 100 pour etre en pourcent
        double proba = FaireRandom.obtenirProbabilite();

    /*    protected void mourir(){
            this.vivant = false;
        } */
        if(proba <= getProbDeces()) {
            this.vivant = false;
           // mourir();
        }
        // endregion
    }

}
