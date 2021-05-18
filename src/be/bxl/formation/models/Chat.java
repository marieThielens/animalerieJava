package be.bxl.formation.models;
import be.bxl.formation.enumerations.Sexe;

public class Chat extends Animal{

    private double PROBA_DECES = 0.5;

    // region champs
    private String caractere;
    private String griffe;
    private String poils;

    // Getters
    public String getCaractere() { return caractere; }
    public String getGriffe() { return griffe; }
    public String getPoils() { return poils; }
    @Override
    protected double getProbDeces() {
        return PROBA_DECES;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }
    public void setGriffe(String griffe) {
        this.griffe = griffe;
    }
    public void setPoils(String poils) {
        this.poils = poils;
    }

    // constructeur
    public Chat(String nom, double poids,String sexe, String dateArrivee,  String caractere,String griffe, String poils){
        super( nom, poids, sexe, dateArrivee);
        setCaractere(caractere);
        setGriffe(griffe);
        setPoils(poils);
    }

    @Override
    public void crier(){
        System.out.println("Miaouuuu miaouuuu");
    }
    @Override
    public String presentationAnimal() {
        return super.presentationAnimal();
    }

}


