package cput.ac.za.bankingapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-04-03.
 */

@Entity
@Table(name ="BANK")
public class Bank {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }


    public Bank(Builder builder) {

        name = builder.name;
        code = builder.code;

    }


    public static class Builder {

        //Equivalent to setters
        private String code;
        private String name;


        public Builder (String code)
        {
            this.code = code; //compalsury
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder copy(Bank bank){

            this.name =bank.getName();
            this.code = bank.getCode();

            return this;
        }

        public Bank build() {
            return new Bank(this);
        }
    }



}
