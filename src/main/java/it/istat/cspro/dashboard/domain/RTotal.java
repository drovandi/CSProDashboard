package it.istat.cspro.dashboard.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Istat Cooperation Unit
 */
@Entity
@Table(name = "MR_TOTAL")
public class RTotal implements Serializable {

    private static final long serialVersionUID = -7027968621986912650L;

    @Id
    @Column(name = "EA_FIELDWORK")
    private int eaFieldwork;
    @Column(name = "EA_FRESHLIST")
    private int eaFreshlist;
    @Column(name = "EA_EXPECTED")
    private int eaExpected;
    @Column(name = "HOUSEHOLD_FIELDWORK")
    private int householdFieldwork;
    @Column(name = "HOUSEHOLD_FRESHLIST")
    private int householdFreshlist;
    @Column(name = "HOUSEHOLD_EXPECTED")
    private int householdExpected;

    public int getEaFieldwork() {
        return eaFieldwork;
    }

    public void setEaFieldwork(int eaFieldwork) {
        this.eaFieldwork = eaFieldwork;
    }

    public int getEaFreshlist() {
        return eaFreshlist;
    }

    public void setEaFreshlist(int eaFreshlist) {
        this.eaFreshlist = eaFreshlist;
    }

    public int getEaExpected() {
        return eaExpected;
    }

    public void setEaExpected(int eaExpected) {
        this.eaExpected = eaExpected;
    }

    public int getHouseholdFieldwork() {
        return householdFieldwork;
    }

    public void setHouseholdFieldwork(int householdFieldwork) {
        this.householdFieldwork = householdFieldwork;
    }

    public int getHouseholdFreshlist() {
        return householdFreshlist;
    }

    public void setHouseholdFreshlist(int householdFreshlist) {
        this.householdFreshlist = householdFreshlist;
    }

    public int getHouseholdExpected() {
        return householdExpected;
    }

    public void setHouseholdExpected(int householdExpected) {
        this.householdExpected = householdExpected;
    }

}
