package it.istat.cspro.dashboard.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author giacomi
 */
@Entity
@Table(name = "cspro2sql_dictionary")
@DynamicUpdate
public class Cspro2SqlDictionary implements Serializable {

    private static final long serialVersionUID = 1L;    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "revision", nullable = false)
    private int revision;

    @Column(name = "total", nullable = false)
    private int total;

    @Column(name = "loaded", nullable = false)
    private int loaded;
    
    @Column(name = "deleted", nullable = false)
    private int deleted;    
    
    @Column(name = "errors", nullable = false)
    private int errors;        
    
    @Column(name = "last_guid", length = 255)
    private String last_guid;            
    
    @Column(name = "next_revision", nullable = false)
    private int nextRevision;            
    
    public Cspro2SqlDictionary() {
    }

    public Cspro2SqlDictionary(Cspro2SqlDictionary c2sDictionary) {
        this.id = c2sDictionary.getId();               
        this.deleted = c2sDictionary.getDeleted();
        this.errors = c2sDictionary.getErrors();
        this.last_guid = c2sDictionary.getLast_guid();
        this.loaded = c2sDictionary.getLoaded();
        this.name = c2sDictionary.getName();
        this.nextRevision = c2sDictionary.getNextRevision();
        this.revision = c2sDictionary.getRevision();
        this.status = c2sDictionary.getStatus();
        this.total = c2sDictionary.getTotal();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setLoaded(int loaded) {
        this.loaded = loaded;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public void setLast_guid(String last_guid) {
        this.last_guid = last_guid;
    }

    public void setNextRevision(int nextRevision) {
        this.nextRevision = nextRevision;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public int getRevision() {
        return revision;
    }

    public int getTotal() {
        return total;
    }

    public int getLoaded() {
        return loaded;
    }

    public int getDeleted() {
        return deleted;
    }

    public int getErrors() {
        return errors;
    }

    public String getLast_guid() {
        return last_guid;
    }

    public int getNextRevision() {
        return nextRevision;
    }
    
    public String getStatusLabel() {
        return (this.status == 1 ? "RUNNING" : "COMPLETED");
    }
}
