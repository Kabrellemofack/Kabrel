public class FactureManager {
    /**
     * declarer les variables globalement et initialiser 
     */
    private String typeProduit;
    private int quantite ;
    private  double prixUnitaire;
    private double total ;
    /**
     * declaration du constructeur pour initialiser mes valeurs
     */
    public FactureManager(String typeProduit, int quantite,double prixUnitaire, double total ){
        this.typeProduit=typeProduit;
        this.quantite=quantite;
        this.prixUnitaire=prixUnitaire;
        this.total=total;
    }
    /**
     * methodes pour la facture et sa rduction
     */
    public factureReduction(){
        
        String Produit =reduction();
        total = calculerFacture();
        // Réduction supplémentaire de 5% pour les gros montants
        if (total > 1000) {
            total -= total * 0.05; 
        }
            return total ;
        }
    }

    /**
     * fonction pour calculer une facture;
     */
    public double calculerFacture() {

        return quantite * prixUnitaire;
    }
    /**
     * reduction sur une facture
     */
    public reduction(){
        switch (typeProduit){
            case "Alimentation":
                total-=total *0.05;
            break ;
            case "Electronique":
                total-=total * 0.1;
            break;
            case "Luxe" : 
                total -=total * 0.15;
            break;
            default :
            System.out.println("pas de reduction a effectuer");
            break;
        }
    }
        
        
    
}
