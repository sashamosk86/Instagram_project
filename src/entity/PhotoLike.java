package entity;

import java.sql.Date;

/**
 * Created by Sasha on 03.10.2017.
 */
public class PhotoLike {
    private long id;
    private long photoId;
    private long userId;
    private Date insertDt;

    public PhotoLike(){}

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

        PhotoLike photoLike = (PhotoLike) o;

        if (id != photoLike.id) return false;
        if (photoId != photoLike.photoId) return false;
        if (userId != photoLike.userId) return false;
        return insertDt != null ? insertDt.equals(photoLike.insertDt) : photoLike.insertDt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (photoId ^ (photoId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (insertDt != null ? insertDt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoLike{" +
                "id=" + id +
                ", photoId=" + photoId +
                ", userId=" + userId +
                ", insertDt=" + insertDt +
                '}';
    }
}
