package com.example.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Characters {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String creature;
    private String imageURL;

    public Characters() {
    }

    public Characters(Integer id, String firstName, String lastName, String nickName, String creature, String imageURL) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.creature = creature;
        this.imageURL = imageURL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", creature='" + creature + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
