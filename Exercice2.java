public class Exercice2 {


    public static void main(String[] args) {
        String bienvenue = "Bienvenue chez Sel et Miel";
        String merci = "Merci, Au revoir";

        System.out.println(bienvenue);
        System.out.println(merci);

        
        /**
         * Nombres Entiers
         */
        int nombrePersonnes = 10;
        int prixUnitaire = 15; 
        System.out.println("Prix total: " + (nombrePersonnes * prixUnitaire));


        /**
         * Concaténation 
         */

         String selEtMiel = "Sel et Miel";
         String messageBienvenue = "Bienvenue";

        System.out.println(messageBienvenue + " "+ selEtMiel);


        /**
         * Tableau - Parcours avec Foreach
         */

         String[] crepes = {"sarrasin", "chocolat","mikado"};
         String[] autresCrepes = new String[] {"sarrasin", "mikado","chocolat"}; 

         for (String uneCrepe : crepes) {
                System.out.println(uneCrepe);
         }

          /**
         * Tableau - Parcours avec For
         */

         for(int i=0; i< autresCrepes.length; i++ ){
            System.out.println(autresCrepes[i]);
         }


         /**
          * Menu 
          */

          int[] prix = {15, 21, 20};
          String[] myPancakes = {"rhubarbe", "mikado","avoine"};

          for (int i = 0; i < myPancakes.length; i++) {
                System.out.println(myPancakes[i] + "\t" + prix[i]);
          }


          /**
           * Menu - version avec Crepe object
           */
          Crepe firstPan = new Crepe("rhubarbe", 10);
          Crepe secondPan = new Crepe("mikado",15);
          Crepe thirdPan = new Crepe("avoine", 20);
          Crepe[] pancakesAsObj = new Crepe[] {firstPan, secondPan, thirdPan};


          for (int i = 0; i < pancakesAsObj.length; i++) {
            System.out.println(pancakesAsObj[i].getName()+ "......" + pancakesAsObj[i].getPrice());
          }

    }
    
}
