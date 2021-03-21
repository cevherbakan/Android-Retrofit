package com.example.retrofit_uygulama;

import com.google.gson.annotations.SerializedName;
public class Post {
    @SerializedName("name")
    private String name;
    @SerializedName("surname")
    private String surname;
    @SerializedName("password")
    private String password;
    @SerializedName("number")
    private String number;

    public Post(String name, String surname, String password, String number) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getNumber() {
        return number;
    }
}