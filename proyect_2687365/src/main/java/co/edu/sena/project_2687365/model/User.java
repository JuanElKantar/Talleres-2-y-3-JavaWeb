package co.edu.sena.project_2687365.model;

public class User {

    private Integer user_id;
    private Integer user_firstname;
    private Integer user_lastname;
    private Integer user_email;
    private Integer user_password;

    public User(Integer user_id, Integer user_firstname, Integer user_lastname, Integer user_email, Integer user_password) {
        this.user_id = user_id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_firstname() {
        return user_firstname;
    }

    public void setUser_firstname(Integer user_firstname) {
        this.user_firstname = user_firstname;
    }

    public Integer getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(Integer user_lastname) {
        this.user_lastname = user_lastname;
    }

    public Integer getUser_email() {
        return user_email;
    }

    public void setUser_email(Integer user_email) {
        this.user_email = user_email;
    }

    public Integer getUser_password() {
        return user_password;
    }

    public void setUser_password(Integer user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_firstname=" + user_firstname + '\''+
                ", user_lastname=" + user_lastname + '\''+
                ", user_email=" + user_email + '\''+
                ", user_password=" + user_password + '\''+
                '}';
    }
}
