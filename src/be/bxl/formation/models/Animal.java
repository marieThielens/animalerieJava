package be.bxl.formation.models;

public class Animal {

    // region champ
    private String nom;
    private int poids;
    private int tailleCm;
    private String sexe;
    private int age;
    private String dateArrivee;
    private double probDeces;
    private boolean vivant;
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
    public double getProbDeces(){ return probDeces;}
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    public void setPoids(int poids){
        this.poids = poids;
    }

    public void setDateArrivee(String dateArrivee){
        this.dateArrivee = dateArrivee;
    }

    // endregion
    public String presentationAnimal(){
        return getNom() + " pèse " + getPoids() + " . C'est un animal de sexe " + getSexe() + " Est arrivé en date du " + getDateArrivee();
    }

    // region constructeur
    public Animal(String nom, int poids, String sexe, String dateArrivee ){
        setNom(nom);
        setPoids(poids);
        setSexe(sexe);
        setDateArrivee(dateArrivee);
    }

    // endregion

    // region methode
        public void crier(String cri){
            System.out.println(getNom() + "te dit : " + cri);
        }
    // endregion

}
