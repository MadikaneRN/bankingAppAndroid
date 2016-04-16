package cput.ac.za.bankingapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-03-28.
 */

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {
    @Id
    @Column(name = "ACC_NO")
    private String accNo;
    @Column(name = "BALANCE")
    private double balance;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;




    public Account(Builder builder) {


        accNo = builder.accNo;
        balance = builder.balance;
        accountType = builder.accountType;

    }


    public String getAccNo() {
        return accNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }





    public static class Builder {

        //Equivalent to setters
        private String accNo;
        private double balance;
        private String accountType;



        public Builder (String accNo) {
            this.accNo = accNo; //compalsury
        }

        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }




        public Builder copy(Account account){
            this.accNo = account.getAccNo(); //changed from account.accNo;
            this.accountType = account.getAccountType();
            this.balance = account.getBalance();
            return this;
        }




        public Account build() {
            return new Account(this);
        }
    }


}
