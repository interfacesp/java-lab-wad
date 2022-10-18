public class Crepe {
    private int prix; 
    private String nom; 

    public Crepe(String aName, int aPrice){
        this.prix = aPrice;
        this.nom = aName; 
    }

    public int getPrice(){
        return this.prix;
    }

    public String getName(){
        return this.nom; 
    }
}
