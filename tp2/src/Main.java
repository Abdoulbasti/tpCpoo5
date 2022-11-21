public class Main {

    public static void main(String[] args) {
        CurriculumVitae cv1 = new CurriculumVitae.CVBuilder()
                .withBac(new Bac("S", Mention.BIEN, 1900))
                .withDAEU(new DAEU("info", Mention.FELICITATIONS, 2020))
                .withLicence(new Licence("Licence Informatique Generale", Mention.PASSABLE, 2020))
                .build();
        System.out.println(cv1);
    }
}
