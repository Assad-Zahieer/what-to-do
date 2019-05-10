package assad.z.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long user_id;
    @NotNull(message = "First name is required")
    @Column(name = "first_name")
    private String email;
    @NotNull(message = "Password is required")
    @Column(name = "password")
    private String password;

    public User() {

    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}

