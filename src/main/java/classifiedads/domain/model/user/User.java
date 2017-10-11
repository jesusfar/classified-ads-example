package classifiedads.domain.model.user;

import java.util.Date;

public class User {
    protected UserId id;
    protected String name;
    protected String lastName;
    protected Date dateBirth;
    protected String email;
    protected Account account;

    public User(UserId id, String name, String lastName, Date dateBirth, String email, Account account) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.email = email;
        this.account = account;
    }

    public UserId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateBirth=" + dateBirth +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }
}
