public class GestionnaireNotes {

    /**
        * fonction pour afficher la moyenne
    */
    
    public void afficherNotesEtMoyenne(String nomEtudiant,int[] notes) {
        
        System.out.println("Notes de " + nomEtudiant + ":");
        afficherNote();
        double moyenne = calculsom()/ notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
    /**
     * fonction pour afficher  et calculer la note 
    */
    public void  calculsom (int[] notes){
        double  somme =0.0;
        for(int note : notes){
            somme +=note;
        }
        System.out.println(somme);
    }
    /**
     * afficher les notes 
     */
    public void afficherNote(int[] notes){
        for(int n : notes){
            System.out.printf("%-5d",n);
        }
    }
    
}
