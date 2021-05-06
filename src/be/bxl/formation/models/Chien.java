package be.bxl.formation.models;

public class Chien extends Animal {

    // region champs
    private String couleurCollier;
    private String race;
    private Boolean dressage;
    // endregion

    // region Encapsulation
    public String getCouleurCollier() { return couleurCollier;}
    public String getRace() { return race; }
    public Boolean getDressage() { return dressage; }

    public void setDressage(Boolean dressage) { this.dressage = dressage; }
    public void setCouleurCollier(String couleurCollier) { this.couleurCollier = couleurCollier; }
    public void setRace(String race) { this.race = race; }
    // endregion

     // region constructeur
    public Chien(String nom, double poids, String sexe, String dateArrivee, String couleurCollier, String race, Boolean Dressage){
        super(nom, poids, sexe, dateArrivee);
        setDressage(dressage);
        setRace(race);
        setCouleurCollier(couleurCollier);
    }
    // endregion
}
