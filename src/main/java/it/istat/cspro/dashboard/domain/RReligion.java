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
@Table(name = "MR_RELIGION")
public class RReligion implements Serializable {

    private static final long serialVersionUID = -9007543673813658348L;

    @Id
    @Column(name = "RELIGION", unique = true, nullable = false)
    private String religion;
    @Column(name = "INDIVIDUALS")
    private int individuals;
    
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getIndividuals() {
        return individuals;
    }

    public void setIndividuals(int individuals) {
        this.individuals = individuals;
    }

}
