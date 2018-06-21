package sr.unasat.intekenlijst.entities;

import java.sql.Time;
import java.util.Date;

public class Tentamen {
    private int TENTAMENT_ID;
    private String VAK;
    private String OMSCHRIJVING;
    private String TENTAMENDATUM;
    private String TENTAMENSTARTTIJD;
    private String TENTAMENDUUR;
    private String TENTAMENTYPE;

    public Tentamen(int TENTAMENT_ID, String VAK, String OMSCHRIJVING, String TENTAMENDATUM, String TENTAMENSTARTTIJD, String TENTAMENDUUR, String TENTAMENTYPE) {
        this.TENTAMENT_ID = TENTAMENT_ID;
        this.VAK = VAK;
        this.OMSCHRIJVING = OMSCHRIJVING;
        this.TENTAMENDATUM = TENTAMENDATUM;
        this.TENTAMENSTARTTIJD = TENTAMENSTARTTIJD;
        this.TENTAMENDUUR = TENTAMENDUUR;
        this.TENTAMENTYPE = TENTAMENTYPE;
    }

    public int getTENTAMENT_ID() {
        return TENTAMENT_ID;
    }

    public void setTENTAMENT_ID(int TENTAMENT_ID) {
        this.TENTAMENT_ID = TENTAMENT_ID;
    }

    public String getVAK() {
        return VAK;
    }

    public void setVAK(String VAK) {
        this.VAK = VAK;
    }

    public String getOMSCHRIJVING() {
        return OMSCHRIJVING;
    }

    public void setOMSCHRIJVING(String OMSCHRIJVING) {
        this.OMSCHRIJVING = OMSCHRIJVING;
    }

    public String getTENTAMENDATUM() {
        return TENTAMENDATUM;
    }

    public void setTENTAMENDATUM(String TENTAMENDATUM) {
        this.TENTAMENDATUM = TENTAMENDATUM;
    }

    public String getTENTAMENSTARTTIJD() {
        return TENTAMENSTARTTIJD;
    }

    public void setTENTAMENSTARTTIJD(String TENTAMENSTARTTIJD) {
        this.TENTAMENSTARTTIJD = TENTAMENSTARTTIJD;
    }

    public String getTENTAMENDUUR() {
        return TENTAMENDUUR;
    }

    public void setTENTAMENDUUR(String TENTAMENDUUR) {
        this.TENTAMENDUUR = TENTAMENDUUR;
    }

    public String getTENTAMENTYPE() {
        return TENTAMENTYPE;
    }

    public void setTENTAMENTYPE(String TENTAMENTYPE) {
        this.TENTAMENTYPE = TENTAMENTYPE;
    }

    @Override
    public String toString() {
        return "Tentamen{" +
                "TENTAMENT_ID=" + TENTAMENT_ID +
                ", VAK='" + VAK + '\'' +
                ", OMSCHRIJVING='" + OMSCHRIJVING + '\'' +
                ", TENTAMENDATUM=" + TENTAMENDATUM +
                ", TENTAMENSTARTTIJD=" + TENTAMENSTARTTIJD +
                ", TENTAMENDUUR='" + TENTAMENDUUR + '\'' +
                ", TENTAMENTYPE='" + TENTAMENTYPE + '\'' +
                '}';
    }
}
