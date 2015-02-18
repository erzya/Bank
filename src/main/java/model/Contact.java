package model;

import java.io.Serializable;

public class Contact implements Serializable {

    private int id;

    private String mobileOne;
    private String mobileTwo;
    private String homeNumber;
    private String email;

    public Contact(){

    }

    public Contact(String mobileOne, String homeNumber,String email){
        this.mobileOne = mobileOne;
        this.email = email;
        this.homeNumber = homeNumber;

    }


  /*  public void print(){
        System.out.println("id= "+id +", email-"+email+", mobile-"+mobileOne+", home-"+homeNumber);
    }
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileOne() {
        return mobileOne;
    }

    public void setMobileOne(String mobileOne) {
        this.mobileOne = mobileOne;
    }

    public String getMobileTwo() {
        return mobileTwo;
    }

    public void setMobileTwo(String mobileTwo) {
        this.mobileTwo = mobileTwo;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
