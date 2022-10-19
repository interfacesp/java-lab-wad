public class Exercice8 {


    public static void main(String[] args) {
        
        String [] tableau = {"pomme", "fraise", "12", "20", "11"};  

        for (int i = 0; i < tableau.length; i++) {
            if(isNumericInt(tableau[i])){
                System.out.println(tableau[i]);
            }
        }

    }


    /**
     *  Détermine si une valeur est un numérique entier
     * 
     * @param value valeur à test
     * @return
     */
    public static boolean isNumericInt(String value) {
        try {
            Integer.parseInt(value);

        }catch (NumberFormatException ex){
            return false; 
        }
        return true;
    } 
    
    
}
