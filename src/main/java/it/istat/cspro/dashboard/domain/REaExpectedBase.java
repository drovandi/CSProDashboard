package it.istat.cspro.dashboard.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REaExpectedBase implements Serializable {
    
    private int id;
    private String name;
    private Integer completed;
    private Integer expected;
    private Double completed_expected;

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

    public List getSplitted() {
        List values = new ArrayList(Arrays.asList(name.split("#")));
        values.add(completed);
        values.add(expected);
        values.add(completed_expected);
        return values;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getExpected() {
        return expected;
    }

    public void setExpected(Integer expected) {
        this.expected = expected;
    }

    public Double getCompleted_expected() {
        return completed_expected;
    }

    public void setCompleted_expected(Double completed_expected) {
        this.completed_expected = completed_expected;
    }
    
}
