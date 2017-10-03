package entity;

import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;


/**
 * Created by Sasha on 03.10.2017.
 */
public class Photo {
    private long id;
    private String namePhoto;
    private byte[] file;
    private int isactive;
    private long userId;
    private Date insertDt;

    public Photo() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamePhoto() {
        return namePhoto;
    }

    public void setNamePhoto(String namePhoto) {
        this.namePhoto = namePhoto;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public int getIsactive() {
        return isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
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

        Photo photo = (Photo) o;

        if (id != photo.id) return false;
        if (isactive != photo.isactive) return false;
        if (userId != photo.userId) return false;
        if (namePhoto != null ? !namePhoto.equals(photo.namePhoto) : photo.namePhoto != null) return false;
        if (!Arrays.equals(file, photo.file)) return false;
        return insertDt != null ? insertDt.equals(photo.insertDt) : photo.insertDt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (namePhoto != null ? namePhoto.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(file);
        result = 31 * result + isactive;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (insertDt != null ? insertDt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", namePhoto='" + namePhoto + '\'' +
                ", file=" + Arrays.toString(file) +
                ", isactive=" + isactive +
                ", userId=" + userId +
                ", insertDt=" + insertDt +
                '}';
    }
}
