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
@Table(name = "MR_INDIVIDUAL_INFO")
public class RIndividualInfo implements Serializable {

    private static final long serialVersionUID = 5859143976887320410L;

    @Id
    @Column(name = "TOTAL", unique = true, nullable = false)
    private int total;
    @Column(name = "TOTAL_MALE")
    private int total_male;
    @Column(name = "TOTAL_FEMALE")
    private int total_female;
    @Column(name = "AGE_AVG")
    private double age_avg;
    @Column(name = "AGE_AVG_MALE")
    private double age_avg_male;
    @Column(name = "AGE_AVG_FEMALE")
    private double age_avg_female;
    @Column(name = "AGE_MAX")
    private int age_max;
    @Column(name = "AGE_MAX_MALE")
    private int age_max_male;
    @Column(name = "AGE_MAX_FEMALE")
    private int age_max_female;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_male() {
        return total_male;
    }

    public void setTotal_male(int total_male) {
        this.total_male = total_male;
    }

    public int getTotal_female() {
        return total_female;
    }

    public void setTotal_female(int total_female) {
        this.total_female = total_female;
    }

    public double getAge_avg() {
        return age_avg;
    }

    public void setAge_avg(double age_avg) {
        this.age_avg = age_avg;
    }

    public double getAge_avg_male() {
        return age_avg_male;
    }

    public void setAge_avg_male(double age_avg_male) {
        this.age_avg_male = age_avg_male;
    }

    public double getAge_avg_female() {
        return age_avg_female;
    }

    public void setAge_avg_female(double age_avg_female) {
        this.age_avg_female = age_avg_female;
    }

    public int getAge_max() {
        return age_max;
    }

    public void setAge_max(int age_max) {
        this.age_max = age_max;
    }

    public int getAge_max_male() {
        return age_max_male;
    }

    public void setAge_max_male(int age_max_male) {
        this.age_max_male = age_max_male;
    }

    public int getAge_max_female() {
        return age_max_female;
    }

    public void setAge_max_female(int age_max_female) {
        this.age_max_female = age_max_female;
    }

}
