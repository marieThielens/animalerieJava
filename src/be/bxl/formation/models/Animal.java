package be.bxl.formation.models;

public class Animal {

    // region champ
    private String nom;
    private int poids;
    private int tailleCm;
    private String sexe;
    private int age;
    private String dateArrivee;
    // endregion

    // region encapsulation
    public String getNom(){
        return nom;
    }
    public int getPoids(){
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
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    public void setDateArrivee(String dateArrivee){
        this.dateArrivee = dateArrivee;
    }

    // endregion
    public String presentationAnimal(){
        return getNom() + " pèse " + getPoids() + " . C'est un animal de sexe " + getSexe() + " Et est arrivé en date du " + getDateArrivee();
    }


    // region constructeur
    public Animal(String nom, String sexe, String dateArrivee ){
        setNom(nom);
        setSexe(sexe);
        setDateArrivee(dateArrivee);
    }

    //

}
