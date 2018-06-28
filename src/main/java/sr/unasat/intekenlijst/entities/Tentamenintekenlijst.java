package sr.unasat.intekenlijst.entities;




public class Tentamenintekenlijst {
private int INTEKEN_ID;
private int STUDENTID;
private String STUDENTNAAM;
private String STUDENTVOORNAAM;
private int TENTAMENID;
private String TENTAMENNAAM;
private String INTEKEN_DATUM;
private String UITTEKEN_DATUM;
private String INGETEKEND;

    public Tentamenintekenlijst(int INTEKEN_ID, int STUDENTID, String STUDENTNAAM, String STUDENTVOORNAAM, int TENTAMENID, String TENTAMENNAAM, String INTEKEN_DATUM, String UITTEKEN_DATUM, String INGETEKEND) {
        this.INTEKEN_ID = INTEKEN_ID;
        this.STUDENTID = STUDENTID;
        this.STUDENTNAAM = STUDENTNAAM;
        this.STUDENTVOORNAAM = STUDENTVOORNAAM;
        this.TENTAMENID = TENTAMENID;
        this.TENTAMENNAAM = TENTAMENNAAM;
        this.INTEKEN_DATUM = INTEKEN_DATUM;
        this.UITTEKEN_DATUM = UITTEKEN_DATUM;
        this.INGETEKEND = INGETEKEND;
    }


    public Tentamenintekenlijst(int STUDENTID, int TENTAMENID, int INTEKEN_ID) {
        this.STUDENTID = STUDENTID;
        this.TENTAMENID = TENTAMENID;
        this.INTEKEN_ID = INTEKEN_ID;
    }



    public Tentamenintekenlijst(int INTEKEN_ID) {
        this.INTEKEN_ID = INTEKEN_ID;
    }

    public int getINTEKEN_ID() {
        return INTEKEN_ID;
    }

    public int getSTUDENTID() {
        return STUDENTID;
    }

    public String getSTUDENTNAAM() {
        return STUDENTNAAM;
    }

    public String getSTUDENTVOORNAAM() {
        return STUDENTVOORNAAM;
    }

    public int getTENTAMENID() {
        return TENTAMENID;
    }

    public String getTENTAMENNAAM() {
        return TENTAMENNAAM;
    }

    public String getINTEKEN_DATUM() {
        return INTEKEN_DATUM;
    }

    public String getUITTEKEN_DATUM() {
        return UITTEKEN_DATUM;
    }

    public String getINGETEKEND() {
        return INGETEKEND;
    }


    @Override
    public String toString() {
        return "Tentamenintekenlijst{" +
                "INTEKE_ID=" + INTEKEN_ID +
                ", STUDENTID=" + STUDENTID +
                ", STUDENTNAAM='" + STUDENTNAAM + '\'' +
                ", STUDENTVOORNAAM='" + STUDENTVOORNAAM + '\'' +
                ", TENTAMENID=" + TENTAMENID +
                ", TENTAMENNAAM='" + TENTAMENNAAM + '\'' +
                ", INTEKEN_DATUM=" + INTEKEN_DATUM +
                ", UITEKEN_DATUM=" + UITTEKEN_DATUM +
                ", INGETEKEND='" + INGETEKEND + '\'' +
                '}';
    }
}

