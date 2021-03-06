package domain;

/**
 * Created by Sasha on 03.10.2017.
 */
public class PhotoComment{

    private long id;
    private long photoId;
    private long userId;
    private String userLogin;
    private String comment;


    public PhotoComment(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoComment that = (PhotoComment) o;

        if (id != that.id) return false;
        if (photoId != that.photoId) return false;
        if (userId != that.userId) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        return comment != null ? comment.equals(that.comment) : that.comment == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (photoId ^ (photoId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoComment{" +
                "id=" + id +
                ", photoId=" + photoId +
                ", userId=" + userId +
                ", userLogin='" + userLogin + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
