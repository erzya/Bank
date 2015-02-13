package model;

import javax.persistence.*;

/**
 * Created by Nikolai on 13.02.2015.
 */

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(name="contact_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "mobile_1")
    private String mobileOne;

    @Column(name = "mobile_2")
    private String mobileTwo;

    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "email")
    private String email;

    public Contact() {

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
