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
@Table(name = "MR_QUESTIONNAIRE_INFO_REGION")
public class RQuestionnaireInfoRegion implements Serializable {

    private static final long serialVersionUID = 3112436945275132353L;

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "REGION")
    private int region;
    @Column(name = "TOTAL", unique = true, nullable = false)
    private int total;
    @Column(name = "AVG_INDIVIDUAL")
    private double avg_individual;

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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg_individual() {
        return avg_individual;
    }

    public void setAvg_individual(double avg_individual) {
        this.avg_individual = avg_individual;
    }

}
