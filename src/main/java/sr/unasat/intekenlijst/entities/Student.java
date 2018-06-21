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

    public Student(int STUDENT_ID) {
        this.STUDENT_ID = STUDENT_ID;
    }

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



    public int getSTUDENT_ID() {
        return STUDENT_ID;
    }

    public void setSTUDENT_ID(int STUDENT_ID) {
        this.STUDENT_ID = STUDENT_ID;
    }

    public String getNAAM() {
        return NAAM;
    }

    public void setNAAM(String NAAM) {
        this.NAAM = NAAM;
    }

    public String getVOORNAAM() {
        return VOORNAAM;
    }

    public void setVOORNAAM(String VOORNAAM) {
        this.VOORNAAM = VOORNAAM;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSTUDENTENNUMMER() {
        return STUDENTENNUMMER;
    }

    public void setSTUDENTENNUMMER(String STUDENTENNUMMER) {
        this.STUDENTENNUMMER = STUDENTENNUMMER;
    }

    public String getADRES() {
        return ADRES;
    }

    public void setADRES(String ADRES) {
        this.ADRES = ADRES;
    }

    public String getCONTACTNUMMER() {
        return CONTACTNUMMER;
    }

    public void setCONTACTNUMMER(String CONTACTNUMMER) {
        this.CONTACTNUMMER = CONTACTNUMMER;
    }

    public String getGESLACHT() {
        return GESLACHT;
    }

    public void setGESLACHT(String GESLACHT) {
        this.GESLACHT = GESLACHT;
    }

    public String getGEBOORTEDATUM() {
        return GEBOORTEDATUM;
    }

    public void setGEBOORTEDATUM(String GEBOORTEDATUM) {
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
