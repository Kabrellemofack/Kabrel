public class StockManager {

    /**
     * fonction pour gerer  un stock
     */
    public void gererStock() {

        testerProduit();

    }
    /**
     * tester un produit 
     */
    public testerProduit(String typeOperation, String produit, int quantite, int stock){
            
        if (typeOperation.equals("ajout")){

        }
        if(typeOperation.equals("retrait") && stock >= quantite ){
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);

        }
        if (stock <= quantite){

            System.out.println("Stock insuffisant pour le produit : " + produit);

        } else {
            System.out.println("Opération inconnue.");

        }

           
    }
    
}
