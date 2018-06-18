package sr.unasat.intekenlijst.entities;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Date;

public class Tentamenintekenlijst {
private int INTEKEN_ID;
private int STUDENTID;
private String STUDENTNAAM;
private String STUDENTVOORNAAM;
private int TENTAMENID;
private String TENTAMENNAAM;
private Date INTEKEN_DATUM;
private Date UITTEKEN_DATUM;
private String INGETEKEND;

    public Tentamenintekenlijst(int INTEKEN_ID, int STUDENTID, String STUDENTNAAM, String STUDENTVOORNAAM, int TENTAMENID, String TENTAMENNAAM, Date INTEKEN_DATUM, Date UITTEKEN_DATUM, String INGETEKEND) {
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

    public int getINTEKEN_ID() {
        return INTEKEN_ID;
    }

    public void setINTEKEN_ID(int INTEKEN_ID) {
        this.INTEKEN_ID = INTEKEN_ID;
    }

    public int getSTUDENTID() {
        return STUDENTID;
    }

    public void setSTUDENTID(int STUDENTID) {
        this.STUDENTID = STUDENTID;
    }

    public String getSTUDENTNAAM() {
        return STUDENTNAAM;
    }

    public void setSTUDENTNAAM(String STUDENTNAAM) {
        this.STUDENTNAAM = STUDENTNAAM;
    }

    public String getSTUDENTVOORNAAM() {
        return STUDENTVOTORNAAM;
    }

    public void setSTUDENTVOORNAAM(String STUDENTVOORNAAM) {
        this.STUDENTVOORNAAM = STUDENTVOORNAAM;
    }

    public int getTENTAMENID() {
        return TENTAMENID;
    }

    public void setTENTAMENID(int TENTAMENID) {
        this.TENTAMENID = TENTAMENID;
    }

    public String getTENTAMENNAAM() {
        return TENTAMENNAAM;
    }

    public void setTENTAMENNAAM(String TENTAMENNAAM) {
        this.TENTAMENNAAM = TENTAMENNAAM;
    }

    public Date getINTEKEN_DATUM() {
        return INTEKEN_DATUM;
    }

    public void setINTEKEN_DATUM(Date INTEKEN_DATUM) {
        this.INTEKEN_DATUM = INTEKEN_DATUM;
    }

    public Date getUITTEKEN_DATUM() {
        return UITTEKEN_DATUM;
    }

    public void setUITTEKEN_DATUM(Date UITTEKEN_DATUM) {
        this.UITTEKEN_DATUM = UITTEKEN_DATUM;
    }

    public String getINGETEKEND() {
        return INGETEKEND;
    }

    public void setINGETEKEND(String INGETEKEND) {
        this.INGETEKEND = INGETEKEND;
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

