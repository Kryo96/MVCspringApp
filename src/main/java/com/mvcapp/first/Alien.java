package com.mvcapp.first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
    @Id
    private int id;
    private String name;

    public Alien(){

    }

    public Alien(int i, String n){
        this.id = i;
        this.name = n;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return this.id + " " + this.name + "";
    }
}
