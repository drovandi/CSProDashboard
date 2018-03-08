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
@Table(name = "MR_SEX_BY_AGE_GROUP_REGION")
public class RSexByAgeGroupRegion implements Serializable {

    private static final long serialVersionUID = 7973459484995613719L;

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "REGION")
    private int region;
    @Column(name = "RANGE")
    private String range;
    @Column(name = "MALE")
    private int male;
    @Column(name = "FEMALE")
    private int female;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

}
