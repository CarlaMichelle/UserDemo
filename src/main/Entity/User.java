import javax.annotation.Generated;

import jdk.jfr.events.CertificateId;

@Entity
@Table (name = "user")

public class User {
    @Column (name = "user_id")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "user_email")
    private String email;
    @Column (name = "user_firstName")
    private String firstName;
    @Column (name = "user_lastName")
    private String lastname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}