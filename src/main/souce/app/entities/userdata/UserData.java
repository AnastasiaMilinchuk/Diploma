package app.entities.userdata;

import app.validation.annotations.PasswordMatches;
import app.validation.annotations.ValidEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by click on 5/5/2016.
 */
@PasswordMatches
public class UserData {
    private int id;
    @ValidEmail
    private String email;

    @NotNull
    @Size(min=1, message = "Enter password")
    private String password;

    @NotNull
    @Size(min=1, message = "Re-enter password")
    private String matchingPassword;

    @NotNull
    @Size(min=1, message = "Fill first name")
    private String firstName;

    @NotNull
    @Size(min=1, message = "Fill flast name")
    private String lastName;
    private Date birthday;
    private String sex;
    private String role;

    public UserData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
