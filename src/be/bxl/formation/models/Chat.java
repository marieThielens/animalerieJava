package be.bxl.formation.models;

public class Chat extends Animal{

    // region champs
    private String caractere;
    private String griffe;
    private String poils;
    private String cri;
    // endregionregion

    // region Encapsulation
    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }
    public void setGriffe(String griffe) {
        this.griffe = griffe;
    }
    public void setPoils(String poils) {
        this.poils = poils;
    }
    public void setCri(String cri) { this.cri = cri; }
    // endregion

    // region constructeur
    public Chat(String nom,int poids, String sexe, String dateArrivee,  String caractere,String griffe, String poils){
        super( nom, poids, sexe, dateArrivee);
        setCaractere(caractere);
        setGriffe(griffe);
        setPoils(poils);
    }
    // endregion



}


