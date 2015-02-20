package model;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Account implements Serializable {

    private int id;

    private Date dateCreate;
    private int currentBalance;
    private Deposit deposit;
    private Transaction transaction;
    private Set<PersonalData> personalDataSet = new HashSet<PersonalData>(0);


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Set<PersonalData> getPersonalDataSet() {
        return personalDataSet;
    }

    public void setPersonalDataSet(Set<PersonalData> personalDataSet) {
        this.personalDataSet = personalDataSet;
    }
}
