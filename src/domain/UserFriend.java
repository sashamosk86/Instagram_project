package domain;

/**
 * Created by Sasha on 03.10.2017.
 */
public class UserFriend{

    private long id;
    private long userMasterId;
    private long userSlaveId;


    public UserFriend(){
        super();
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFriend that = (UserFriend) o;

        if (id != that.id) return false;
        if (userMasterId != that.userMasterId) return false;
        return userSlaveId == that.userSlaveId;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userMasterId ^ (userMasterId >>> 32));
        result = 31 * result + (int) (userSlaveId ^ (userSlaveId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "UserFriend{" +
                "id=" + id +
                ", userMasterId=" + userMasterId +
                ", userSlaveId=" + userSlaveId +
                '}';
    }
}
