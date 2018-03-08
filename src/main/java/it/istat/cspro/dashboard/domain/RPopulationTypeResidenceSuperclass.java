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
public class RPopulationTypeResidenceSuperclass implements Serializable {

    private static final long serialVersionUID = 6299996078458103615L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    @Column(name = "RANGE")
    private String range;
    @Column(name = "1")
    private int type1;
    @Column(name = "2")
    private int type2;
    @Column(name = "3")
    private int type3;
    @Column(name = "4")
    private int type4;
    @Column(name = "5")
    private int type5;
    @Column(name = "6")
    private int type6;
    @Column(name = "7")
    private int type7;
    @Column(name = "8")
    private int type8;
    @Column(name = "9")
    private int type9;
    @Column(name = "10")
    private int type10;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public int getType3() {
        return type3;
    }

    public void setType3(int type3) {
        this.type3 = type3;
    }

    public int getType4() {
        return type4;
    }

    public void setType4(int type4) {
        this.type4 = type4;
    }

    public int getType5() {
        return type5;
    }

    public void setType5(int type5) {
        this.type5 = type5;
    }

    public int getType6() {
        return type6;
    }

    public void setType6(int type6) {
        this.type6 = type6;
    }

    public int getType7() {
        return type7;
    }

    public void setType7(int type7) {
        this.type7 = type7;
    }

    public int getType8() {
        return type8;
    }

    public void setType8(int type8) {
        this.type8 = type8;
    }

    public int getType9() {
        return type9;
    }

    public void setType9(int type9) {
        this.type9 = type9;
    }

    public int getType10() {
        return type10;
    }

    public void setType10(int type10) {
        this.type10 = type10;
    }
    
}
