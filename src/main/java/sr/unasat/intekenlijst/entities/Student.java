
package sr.unasat.intekenlijst.entities;     // package is voor het ordenen van classes

public class Student {                      //Public=access modifier Class=keyword student=classname hier maake je class student aan
    private int STUDENT_ID;                 // hier geef je aan welke collomen in je database zijn en welke data type ze bevatten(int en string
    private String NAAM;                    // private=access modifier datatype= string en int
    private String VOORNAAM;
    private String EMAIL;
    private String STUDENTENNUMMER;
    private String ADRES;
    private String CONTACTNUMMER;
    private String GESLACHT;
    private String GEBOORTEDATUM;


    public Student(int STUDENT_ID, String NAAM, String VOORNAAM, String EMAIL, String STUDENTENNUMMER, String ADRES, String CONTACTNUMMER, String GESLACHT, String GEBOORTEDATUM)
    //public=accessmodifier_Student=classname_() parentesis_int STUDENT_ID, String NAAM, String VOORNAAM, String EMAIL, String STUDENTENNUMMER, String ADRES, String CONTACTNUMMER, String GESLACHT, String GEBOORTEDATUM = parameters
    {
        this.STUDENT_ID = STUDENT_ID; // refereer je naar je collomen
        this.NAAM = NAAM;
        this.VOORNAAM = VOORNAAM;
        this.EMAIL = EMAIL;
        this.STUDENTENNUMMER = STUDENTENNUMMER;
        this.ADRES = ADRES;
        this.CONTACTNUMMER = CONTACTNUMMER;
        this.GESLACHT = GESLACHT;
        this.GEBOORTEDATUM = GEBOORTEDATUM;
    }                      // dit heel ding is een constuctor je maakt van je class een object


    @Override                  //
    public String toString()  //public=accessmodifier string-datatype toString=method toString is zodat je leesbare text krijgt uit je system out println

    {
        return "Student" +" "+
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
