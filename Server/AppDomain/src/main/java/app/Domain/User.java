package app.Domain;



import java.io.Serializable;
import java.util.Objects;


public class User implements Comparable<User>, Serializable {
    private String id, passwd, name;

    public User() {
    }

    public User(String id) {
        this(id,"","");
    }

    public User(String id, String passwd) {
        this(id,passwd,"");
    }

    public User(String id, String passwd, String name) {
        this.id = id;
        this.passwd = passwd;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", passwd='" + passwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(passwd, user.passwd) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passwd, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
