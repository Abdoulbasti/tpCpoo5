public final class Bac extends Diplome {
    public Bac(String intitule, Mention mention, int annee) {
        super(intitule, mention, annee);
    }


    public String toString()
    {
        return "BAC" +"(" +intitule +"," +mention +"," +annee +")";
    }
}