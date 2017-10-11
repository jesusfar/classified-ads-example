package classifiedads.domain.model.user;

import java.util.UUID;

public class AccountId {
    private String id;

    public AccountId() {
        id = UUID.randomUUID().toString();
    }

    public AccountId(String id) {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountId accountId = (AccountId) o;

        return id != null ? id.equals(accountId.id) : accountId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return id;
    }
}
