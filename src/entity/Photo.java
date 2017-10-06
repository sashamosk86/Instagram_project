package entity;

import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;


/**
 * Created by Sasha on 03.10.2017.
 */
public class Photo {
    private long id;
    private String name;
    private byte[] file;
    private long userId;
    private Date insertDt;

    public Photo() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
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
        if (userId != photo.userId) return false;
        if (name != null ? !name.equals(photo.name) : photo.name != null) return false;
        if (!Arrays.equals(file, photo.file)) return false;
        return insertDt != null ? insertDt.equals(photo.insertDt) : photo.insertDt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(file);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (insertDt != null ? insertDt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", namePhoto='" + name + '\'' +
                ", file=" + Arrays.toString(file) +
                ", userId=" + userId +
                ", insertDt=" + insertDt +
                '}';
    }
}
