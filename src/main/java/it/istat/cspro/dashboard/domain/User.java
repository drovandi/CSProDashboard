package it.istat.cspro.dashboard.domain;

import it.istat.cspro.dashboard.utils.StringListConverter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Istat Cooperation Unit
 */
@Entity
@Table(name = "c_user")
@DynamicUpdate
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "password", length = 100)
    private String password;

    @Email
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "firstname", length = 100)
    private String firstname;

    @Column(name = "middlename", length = 100)
    private String middlename;

    @Column(name = "lastname", length = 100)
    private String lastname;

    @NotNull
    @Column(name = "role")
    @Convert(converter = StringListConverter.class)
    private List<String> roles;

    public User() {
    }

    public User(User user) {
        this.id = user.getId();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.firstname = user.getFirstname();
        this.middlename = user.getMiddlename();
        this.lastname = user.getLastname();
        this.roles = user.getRoles();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}
