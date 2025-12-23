package C07ExceptionFileParsing.MemberException;

// 객체, 엔티디
public class Member {
    private long id;
    private static long staticId;
    private String name;
    private String email;
    private String password;

    public Member(String name, String email, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
