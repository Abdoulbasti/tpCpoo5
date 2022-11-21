public final class Licence extends Diplome {

    public Licence(String intitule, Mention mention, int annee)
    {
        super(intitule, mention, annee);
    }

    public String toString()
    {
        return "LICENCE" +"(" +intitule +"," +mention +"," +annee +")";
    }
}