package cn.tommypoon.ioc;

public class FirstBean {
    private int id;
    private String name;

    public FirstBean() {
        System.out.println("constructor method is invoked");
    }

    public void init() {
        System.out.println("init method is invoked");
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
}
