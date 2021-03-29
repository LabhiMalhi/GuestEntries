package com.Malhi;

import java.util.Map;

public class Guest {
    int age;
    String name;
    String phone;
    int guestId = (int)Math.random()*100;

    public Guest(int age, String name, String phone) {
        this.age = age;
        this.name = name;
        this.phone = phone;

    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", guestId=" + guestId +
                '}';
    }
}
