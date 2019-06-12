package cn.itcase.jdbc;


import java.util.Date;

public class jdbcDemo3  {
    private String name;
    private Integer Age;
    private Date birthday;

    public jdbcDemo3(String name, Integer age, Date birthday) {
        this.name = name;
        Age = age;
        this.birthday = birthday;
    }
    public void add(){
        System.out.println(name+","+Age+","+birthday);
    }

}
