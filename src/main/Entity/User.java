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

    public void addUser(){

    }

    public User findUserById (int id){

        return User;

    }

    public User findUserByName (String name){

        return User;


    }

    public void uddateUser (User usuario){

        
    }


}