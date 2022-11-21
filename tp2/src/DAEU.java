public final class  DAEU extends Diplome{
    public DAEU(String intitule, Mention mention, int annee)
    {
        super(intitule, mention, annee);
    }

    public String toString()
    {
        return "DAEU" +"(" +intitule +"," +mention +"," +annee +")";
    }
}
