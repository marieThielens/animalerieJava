package be.bxl.formation.helpers;

/**
 * Cette méthode permet d'obtenir unevaleur aléatoire entre 0 et 100 avec 2 decimal
 */
public class FaireRandom {
    // static permet d'utiliser cette methode n'appartient pas à une instance
    public static double obtenirProbabilite() {
        // (chiffre entre 0 et 10000) / x 100 . Permet d'obtenir entre 0 et 100 evc deux décimales
       return Math.round(Math.random() * 10000) / 100.0 ;

    }
}
