package model;

import java.io.Serializable;

public class Currency implements Serializable {

    private int id;
    private String name;
    private int rate;

    public Currency(){

    }

    public Currency(String name, int rate){
        this.name = name;
        this.rate = rate;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }



}
