package entity;

import java.sql.Date;

/**
 * Created by Sasha on 03.10.2017.
 */
public class UserFriend {
    private long id;
    private long userMasterId;
    private long userSlaveId;
    private Date insertDt;

    public UserFriend(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserMasterId() {
        return userMasterId;
    }

    public void setUserMasterId(long userMasterId) {
        this.userMasterId = userMasterId;
    }

    public long getUserSlaveId() {
        return userSlaveId;
    }

    public void setUserSlaveId(long userSlaveId) {
        this.userSlaveId = userSlaveId;
    }

    public Date getInsertDt() {
        return insertDt;
    }

    public void setInsertDt(Date insertDt) {
        this.insertDt = insertDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFriend that = (UserFriend) o;

        if (id != that.id) return false;
        if (userMasterId != that.userMasterId) return false;
        if (userSlaveId != that.userSlaveId) return false;
        return insertDt != null ? insertDt.equals(that.insertDt) : that.insertDt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userMasterId ^ (userMasterId >>> 32));
        result = 31 * result + (int) (userSlaveId ^ (userSlaveId >>> 32));
        result = 31 * result + (insertDt != null ? insertDt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserFriend{" +
                "id=" + id +
                ", userMasterId=" + userMasterId +
                ", userSlaveId=" + userSlaveId +
                ", insertDt=" + insertDt +
                '}';
    }
}
