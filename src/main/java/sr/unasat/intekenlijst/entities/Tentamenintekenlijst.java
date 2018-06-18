package sr.unasat.intekenlijst.entities;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Date;

public class Tentamenintekenlijst {
private int INTEKE_ID;
private int STUDENTID;
private String STUDENTNAAM;
private String STUDENTVOORNAAM;
private int TENTAMENID;
private String TENTAMENNAAM;
private Date INTEKEN_DATUM;
private Date UITEKEN_DATUM;
private String INGETEKEND;

    public Tentamenintekenlijst(int INTEKE_ID, int STUDENTID, String STUDENTNAAM, String STUDENTVOORNAAM, int TENTAMENID, String TENTAMENNAAM, Date INTEKEN_DATUM, Date UITEKEN_DATUM, String INGETEKEND) {
        this.INTEKE_ID = INTEKE_ID;
        this.STUDENTID = STUDENTID;
        this.STUDENTNAAM = STUDENTNAAM;
        this.STUDENTVOORNAAM = STUDENTVOORNAAM;
        this.TENTAMENID = TENTAMENID;
        this.TENTAMENNAAM = TENTAMENNAAM;
        this.INTEKEN_DATUM = INTEKEN_DATUM;
        this.UITEKEN_DATUM = UITEKEN_DATUM;
        this.INGETEKEND = INGETEKEND;
    }

    public int getINTEKE_ID() {
        return INTEKE_ID;
    }

    public void setINTEKE_ID(int INTEKE_ID) {
        this.INTEKE_ID = INTEKE_ID;
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
        return STUDENTVOORNAAM;
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

    public Date getUITEKEN_DATUM() {
        return UITEKEN_DATUM;
    }

    public void setUITEKEN_DATUM(Date UITEKEN_DATUM) {
        this.UITEKEN_DATUM = UITEKEN_DATUM;
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
                "INTEKE_ID=" + INTEKE_ID +
                ", STUDENTID=" + STUDENTID +
                ", STUDENTNAAM='" + STUDENTNAAM + '\'' +
                ", STUDENTVOORNAAM='" + STUDENTVOORNAAM + '\'' +
                ", TENTAMENID=" + TENTAMENID +
                ", TENTAMENNAAM='" + TENTAMENNAAM + '\'' +
                ", INTEKEN_DATUM=" + INTEKEN_DATUM +
                ", UITEKEN_DATUM=" + UITEKEN_DATUM +
                ", INGETEKEND='" + INGETEKEND + '\'' +
                '}';
    }
}

