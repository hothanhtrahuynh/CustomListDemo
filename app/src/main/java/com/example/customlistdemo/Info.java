package com.example.customlistdemo;

public class Info {
    String phone, name;
    int resource;
    public Info(String phone, String name, int res){
        this.name = name;
        this.phone = phone;
        this.resource= res;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getResource() {
        return resource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
