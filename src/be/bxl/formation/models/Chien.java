package be.bxl.formation.models;

public class Chien extends Animal {
    private final double PROBA_DECES = 1;

    private String couleurCollier;
    private String race;
    private Boolean dressage;

    // region Encapsulation
    public String getCouleurCollier() { return couleurCollier;}
    public String getRace() { return race; }
    public Boolean getDressage() { return dressage; }
    @Override
    protected double getProbDeces() {
        return PROBA_DECES;
    }

    public void setDressage(Boolean dressage) { this.dressage = dressage; }
    public void setCouleurCollier(String couleurCollier) { this.couleurCollier = couleurCollier; }
    public void setRace(String race) { this.race = race; }


     // region constructeur
    public Chien(String nom, double poids, String sexe, String dateArrivee, String couleurCollier, String race, Boolean Dressage){
        super(nom, poids, sexe, dateArrivee);
        setDressage(dressage);
        setRace(race);
        setCouleurCollier(couleurCollier);
    }
    // endregion
    @Override
    public void crier(){
        System.out.println("Wouf wouf");
    }
}
