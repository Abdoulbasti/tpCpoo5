public class CurriculumVitae {

    /*EXO3 : si on passe par le surchage du constructeur le nombre de contructeur sera 2*4=8*/
    /*public CurriculumVitae(Bac bac, Licence licence, Master master, Doctorat doctorat)
    {

    }
    public CurriculumVitae(Bac bac, Licence licence, Master master)
    {

    }
    public CurriculumVitae(Bac bac, Licence licence)
    {

    }
    public CurriculumVitae(Bac bac)
    {

    }*/
    //On fait pareil avec le DAEU

    //Si le DAEU est un diplôme de 2eme année on aurra 5 constructeur diferente

    /*EXO4:

    public void setBac(Bac bac)
    {

    }*/

    /*EXO5 : */


    /*EXO6 : */
    private Bac bac;
    private DAEU daeu;
    private Licence licence;
    private Master master;
    private Doctorat doctorat;

    public Bac getBac() {
        return bac;
    }

    public static class CVBuilder {
        private Bac bac;
        private DAEU daeu;
        private Licence licence;
        private Master master;
        private Doctorat doctorat;

        public CVBuilder withBac(Bac bac) {
            this.bac = bac;
            return this; // Retourner l'objet courant qui à été mis à jour après l'opertion
        }

        public CVBuilder withDAEU(DAEU daeu) {
            this.daeu = daeu;
            return this;
        }

        public CVBuilder withLicence(Licence licence) {
            this.licence = licence;
            return this;
        }

        public CVBuilder withMaster(Master master) {
            this.master = master;
            return this;
        }

        public CVBuilder withDoctorat(Doctorat doctorat) {
            this.doctorat = doctorat;
            return this;
        }


        public CurriculumVitae build() {
            return new CurriculumVitae(this); //This pour dire que que le amrametre de lobjet est le courant
            /*
            CurriculumVitae cv = new CurriculumVitae();
            cv.bac = bac;
            cv.daeu = daeu;
            cv.licence = licence;
            cv.master = master;
            cv.doctorat = doctorat;
            return cv;
            */
        }
    }

    public CurriculumVitae(CVBuilder b)
    {
        this.bac = b.bac;
        this.daeu = b.daeu;
        this.licence = b.licence;
        this.master = b.master;
        this.doctorat = b.doctorat;
    }

    public String toString()
    {
        return bac +" , \n" +daeu +" , \n" +licence +" , \n" +master +" , \n" +doctorat;
    }
}
    /*public CurriculumVitae(CVBuilder cvBuilder)
    {
        bac = cvBuilder.bac;
        daeu = cvBuilder.daeu;
        licence = cvBuilder.licence;
        master = cvBuilder.master;
        doctorat = cvBuilder.doctorat;
    }*/