public final class DiplomeInge extends Diplome{
    public DiplomeInge(String intitule, Mention mention, int annee)
    {
        super(intitule, mention, annee);
    }

    public String toString()
    {
        return "DIPLOMEINGE" +"(" +intitule +"," +mention +"," +annee +")";
    }
}
