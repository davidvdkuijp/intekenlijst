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

    public String getVAK() {
        return VAK;
    }

    public String getOMSCHRIJVING() {
        return OMSCHRIJVING;
    }

    public String getTENTAMENDATUM() {
        return TENTAMENDATUM;
    }

    public String getTENTAMENSTARTTIJD() {
        return TENTAMENSTARTTIJD;
    }

    public String getTENTAMENDUUR() {
        return TENTAMENDUUR;
    }

    public String getTENTAMENTYPE() {
        return TENTAMENTYPE;
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
