package cn.itcase.domain;

import java.util.Date;
import java.util.List;

public class customer {
    private int id;
    private String name;
    private Date birthday;
    private int eng;
    private int math;
    private String addr;
    private String town;
    private String email;
    private String male;
    private String phone;

    private List<saleinfo> saleinfos;

    public List<saleinfo> getSaleinfos() {
        return saleinfos;
    }

    public void setSaleinfos(List<saleinfo> saleinfos) {
        this.saleinfos = saleinfos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", eng=" + eng +
                ", math=" + math +
                ", addr='" + addr + '\'' +
                ", town='" + town + '\'' +
                ", email='" + email + '\'' +
                ", male='" + male + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
