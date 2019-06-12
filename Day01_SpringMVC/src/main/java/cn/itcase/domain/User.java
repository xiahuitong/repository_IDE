package cn.itcase.domain;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class User {
    private String username;
    private Integer password;
    private Double money;
    //自定义类型转换
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //    封装javabean对象
    private Student student;
//    封装list集合对象
    private List<Student> list;
//    封装Map集合对象
    private Map<String,Student> map;

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Map<String, Student> getMap() {
        return map;
    }

    public void setMap(Map<String, Student> map) {
        this.map = map;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", money=" + money +
                ", birthday=" + birthday +
                ", student=" + student +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
