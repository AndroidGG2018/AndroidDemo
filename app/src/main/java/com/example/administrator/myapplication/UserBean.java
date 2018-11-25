package com.example.administrator.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class UserBean extends BaseObservable {

    private String name;
    private int age;
    private String phone;

    public UserBean(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
    @Bindable
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }
}
