package it.istat.cspro.dashboard.domain;

import java.io.Serializable;

/**
 *
 * @author Istat Cooperation Unit
 */
public class RHouseholdExpectedBase implements Serializable {

    private static final long serialVersionUID = -9167852144435794751L;

    private int id;
    private String name;
    private Integer field;
    private Integer freshlist;
    private Integer expected;
    private Double field_freshlist;
    private Double field_expected;
    private Double freshlist_expected;

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

    public Double getField_freshlist() {
        return field_freshlist;
    }

    public void setField_freshlist(Double field_freshlist) {
        this.field_freshlist = field_freshlist;
    }

    public Double getField_expected() {
        return field_expected;
    }

    public void setField_expected(Double field_expected) {
        this.field_expected = field_expected;
    }

    public Double getFreshlist_expected() {
        return freshlist_expected;
    }

    public void setFreshlist_expected(Double freshlist_expected) {
        this.freshlist_expected = freshlist_expected;
    }

}
