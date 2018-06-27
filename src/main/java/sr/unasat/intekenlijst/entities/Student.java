package sr.unasat.intekenlijst.entities;




public class Student {
    private int STUDENT_ID;
    private String NAAM;
    private String VOORNAAM;
    private String EMAIL;
    private String STUDENTENNUMMER;
    private String ADRES;
    private String CONTACTNUMMER;
    private String GESLACHT;
    private String GEBOORTEDATUM;


    public Student(int STUDENT_ID, String NAAM, String VOORNAAM, String EMAIL, String STUDENTENNUMMER, String ADRES, String CONTACTNUMMER, String GESLACHT, String GEBOORTEDATUM) {
        this.STUDENT_ID = STUDENT_ID;
        this.NAAM = NAAM;
        this.VOORNAAM = VOORNAAM;
        this.EMAIL = EMAIL;
        this.STUDENTENNUMMER = STUDENTENNUMMER;
        this.ADRES = ADRES;
        this.CONTACTNUMMER = CONTACTNUMMER;
        this.GESLACHT = GESLACHT;
        this.GEBOORTEDATUM = GEBOORTEDATUM;
    }



    @Override
    public String toString() {
        return "Student{" +
                "STUDENT_ID=" + STUDENT_ID +
                ", NAAM='" + NAAM + '\'' +
                ", VOORNAAM='" + VOORNAAM +
                ", EMAIL='" + EMAIL +
                ", STUDENTENNUMMER='" + STUDENTENNUMMER +
                ", ADRES='" + ADRES +
                ", CONTACTNUMMER='" + CONTACTNUMMER +
                ", GESLACHT='" + GESLACHT +
                ", GEBOORTEDATUM='" + GEBOORTEDATUM +
                '}';
    }
}
