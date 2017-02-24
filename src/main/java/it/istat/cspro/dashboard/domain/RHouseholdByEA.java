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
@Table(name = "MR_HOUSEHOLD_BY_EA")
public class RHouseholdByEA implements Serializable {

    private static final long serialVersionUID = -672549009821546040L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "HOUSEHOLD")
    private Integer household;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHousehold() {
        return household;
    }

    public void setHousehold(Integer household) {
        this.household = household;
    }

}
