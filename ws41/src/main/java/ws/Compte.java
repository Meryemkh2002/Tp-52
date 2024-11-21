package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)

public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;

    public Compte(int code,double solde, Date dateCreation){
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte(){

    }

    // Getter for 'code'
    public int getCode() {
        return code;
    }

    // Setter for 'code'
    public void setCode(int code) {
        this.code = code;
    }

    // Getter for 'solde'
    public double getSolde() {
        return solde;
    }

    // Setter for 'solde'
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Getter for 'dateCreation'
    public Date getDateCreation() {
        return dateCreation;
    }

    // Setter for 'dateCreation'
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


}
