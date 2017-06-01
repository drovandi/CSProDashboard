package it.istat.cspro.dashboard.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Istat Cooperation Unit
 */
@MappedSuperclass
public abstract class RHouseholdExpectedBase implements Serializable {

    private static final long serialVersionUID = 8067791712877389749L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "FIELD")
    private Integer field;
    @Column(name = "FRESHLIST")
    private Integer freshlist;
    @Column(name = "EXPECTED")
    private Integer expected;
    @Column(name = "FIELD_FRESHLIST")
    private Double fieldFreshlist;
    @Column(name = "FIELD_EXPECTED")
    private Double fieldExpected;
    @Column(name = "FRESHLIST_EXPECTED")
    private Double freshlistExpected;

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

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public Integer getFreshlist() {
        return freshlist;
    }

    public void setFreshlist(Integer freshlist) {
        this.freshlist = freshlist;
    }

    public Integer getExpected() {
        return expected;
    }

    public void setExpected(Integer expected) {
        this.expected = expected;
    }

    public Double getFieldFreshlist() {
        return fieldFreshlist;
    }

    public void setFieldFreshlist(Double fieldFreshlist) {
        this.fieldFreshlist = fieldFreshlist;
    }

    public Double getFieldExpected() {
        return fieldExpected;
    }

    public void setFieldExpected(Double fieldExpected) {
        this.fieldExpected = fieldExpected;
    }

    public Double getFreshlistExpected() {
        return freshlistExpected;
    }

    public void setFreshlistExpected(Double freshlistExpected) {
        this.freshlistExpected = freshlistExpected;
    }

}
