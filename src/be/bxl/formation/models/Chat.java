package be.bxl.formation.models;

public class Chat extends Animal{

    // region champs
    private String caractere;
    private String griffe;
    private String poils;
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
    // endregion

    // region constructeur
    public Chat(String nom, double poids, String sexe, String dateArrivee,  String caractere,String griffe, String poils){
        super( nom, poids, sexe, dateArrivee);
        setCaractere(caractere);
        setGriffe(griffe);
        setPoils(poils);
    }
    // endregion

    @Override
    public void crier(){
        System.out.println("Miaouuuu miaouuuu");
    }




}


