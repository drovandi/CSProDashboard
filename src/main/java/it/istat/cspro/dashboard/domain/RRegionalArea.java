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
@Table(name = "MR_REGIONAL_AREA")
public class RRegionalArea implements Serializable {

    private static final long serialVersionUID = 6541175239488471312L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "VALUE")
    private int value;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
