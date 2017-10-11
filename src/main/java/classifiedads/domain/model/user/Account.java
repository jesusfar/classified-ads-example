package classifiedads.domain.model.user;

import java.util.Date;

public class Account {
    private AccountId id;
    private String username;
    private String password;
    private AccountStatus accountStatus;
    private Date creationDate;

    public Account(AccountId id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountStatus = AccountStatus.ENABLED;
        this.creationDate = new Date();
    }

    public AccountId getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
