package exo4;

public class SimpleDate {
    private int jour;
    private int mois;
    private int annee;

    public int getAnnee() {
        return annee;
    }
    public int getJour() {
        return jour;
    }
    public int getMois() {
        return mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }

    public SimpleDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {

        return this.jour +"/" +this.mois +"/" +this.annee;
    }

    //Verfie que la date est bien correct.
    public boolean isValid(int jour, int mois, int annee) throws IllegalArgumentException
    {
        return jour <= 31 || mois <= 12;
    }
}