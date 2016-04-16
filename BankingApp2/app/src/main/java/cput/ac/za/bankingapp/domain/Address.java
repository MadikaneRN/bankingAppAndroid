package cput.ac.za.bankingapp.domain;

import javax.persistence.Embeddable;

/**
 * Created by Scorpian on 2016-04-01.
 */

@Embeddable
public class Address {

    private String streetName;
    private String city;
    private String postalCode;


    public Address(Builder builder) {


        streetName = builder.streetName;
        city = builder.city;
        postalCode = builder.postalCode;

    }


    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }


    public static class Builder {

        //Equivalent to setters
        private String streetName;
        private String city;
        private String postalCode;



        public Builder (String streetName)
        {
            this.streetName = streetName; //compalsury
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }




        public Builder copy(Address address){

            this.streetName =address.getStreetName();

            this.city = address.getCity();

            this.postalCode = address.getPostalCode();

            return this;
        }




        public Address build() {
            return new Address(this);
        }
    }



}
