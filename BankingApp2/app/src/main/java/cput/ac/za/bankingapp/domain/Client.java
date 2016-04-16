package cput.ac.za.bankingapp.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-03-28.
 */

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name ="NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surName;


    /*
    @Embedded
    private Address address // Valued Object
    */

    public Client(Builder builder) {


        idNo = builder.idNo;
        surName = builder.surName;
        name = builder.name;

    }



    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getIdNo() {
        return idNo;
    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String surName;
        private String idNo;



        public Builder (String idNo) {
            this.idNo = idNo; //compalsury
        }

        public Builder surName(String Surname) {
            this.surName = Surname;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }



        public Builder copy(Client client){

            this.idNo = client.getIdNo();
            this.name = client.getName();
            this.surName = client.getSurName();
            return this;
        }



        public Client build() {
            return new Client(this);
        }
    }



}
