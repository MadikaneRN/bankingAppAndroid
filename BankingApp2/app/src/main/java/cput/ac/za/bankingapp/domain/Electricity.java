package cput.ac.za.bankingapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-04-01.
 */

@Entity
@Table(name = "ELECTRICITY")
public class Electricity {

    @Id
    @Column(name ="METER_NO")
    private String meterNo;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;


     @Column(name = "AMOUNT")
    private double amount;
    public double getAmount() {
        return  amount;
    }


    public String getSupplierName() {
        return supplierName;
    }

    public String getMeterNo() {
        return meterNo;
    }


    public Electricity(Builder builder) {

        meterNo = builder.meterNo;
        supplierName = builder.supplierName;
        amount = builder.amount;
    }



    public static class Builder {

        private String meterNo;
        private String supplierName;
         private double amount;

        public Builder (String meterNo)
        {
            this.meterNo = meterNo; //compalsury
        }

        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }


        public Builder amount(double amount)
        {
            this.amount = amount;
            return this;
        }


        public Builder copy(Electricity electricity){

            this.supplierName = electricity.getSupplierName();
            this.meterNo = electricity.getMeterNo();
            return this;
        }


        public Electricity build()
        {
            return new Electricity(this);
        }

    }



}
