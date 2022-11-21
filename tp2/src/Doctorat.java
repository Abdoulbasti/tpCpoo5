public final class Doctorat extends Diplome{

    public Doctorat(String intitule, Mention mention, int annee) {
        super(intitule, mention, annee);
    }


    public String toString()
    {
        return "MASTER" +"(" +intitule +"," +mention +"," +annee +")";
    }
}
