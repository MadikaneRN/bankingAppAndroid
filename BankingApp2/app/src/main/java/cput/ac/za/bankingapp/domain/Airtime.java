package cput.ac.za.bankingapp.domain;

import android.support.annotation.IdRes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-04-01.
 */

@Entity
@Table(name ="AIRTIME")
public class Airtime {

    @Id
    @Column(name = "CELLPHONE_NO")
    private String cellphoneNo;
    @Column(name= "BENEFECIARY")
    private String beneficiary;
    @Column(name = "SERVICE_PROVIDER")
    private String serviceProvider;


    public Airtime(Builder builder) {

        cellphoneNo = builder.cellphoneNo;
        beneficiary = builder.beneficiary;
        serviceProvider = builder.serviceProvider;

    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public String getBeneficiary() {
        return beneficiary;
    }


    public static class Builder {

        private String cellphoneNo;
        private String beneficiary;
        private String serviceProvider;



        public Builder (String cellphoneNo)
        {
            this.cellphoneNo = cellphoneNo; //compalsury
        }

        public Builder beneficiary(String beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }

        public Builder serviceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }




        public Builder copy(Airtime airtime){

            this.cellphoneNo = airtime.getCellphoneNo();
            this.beneficiary = airtime.getBeneficiary();
            this.serviceProvider = airtime.getServiceProvider();
            return this;
        }


        public Airtime build()
        {
            return new Airtime(this);
        }
    }



}
