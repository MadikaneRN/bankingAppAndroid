package cput.ac.za.bankingapp.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-04-01.
 */

@Entity
@Table(name = "LOAN")
public class Loan {

    @Id
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "SALARY")
    private double salary;
    @Column(name = "QUALIFY")
    private boolean qualify;
    @Column(name ="LOAN_AMOUNT")
    private double loanAmount;
    @Column(name = "CURRENT_DATE")
    private Date currentDate;

    private String loanStatus;

    private String loanType;

    public Loan(Builder builder) {


        userId = builder.userId;
        salary = builder.salary;
        loanAmount = builder.loanAmount;
        currentDate = builder.currentDate;
        qualify =  builder.qualify;

    }


    public double getSalary() {
        return salary;
    }

    public boolean getQualify() {
        return qualify;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getUserId() {
        return userId;
    }


    public static class Builder {

        private double salary;
        private boolean qualify;
        private double loanAmount;
        private Date currentDate;
        private String userId;



        public Builder (String userId)
        {
            this.userId = userId; //compalsury
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder qualify(boolean qualify) {
            this.qualify =qualify;
            return this;
        }

        public Builder loanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
            return this;
        }


        public Builder currentDate(Date currentDate) {
            this.currentDate = currentDate;
            return this;
        }


        public Builder copy(Loan loan){

            this.userId = loan.getUserId();
            this.currentDate = loan.getCurrentDate();
            this.loanAmount = loan.getLoanAmount();
            this.salary = loan.getSalary();
            this.qualify = loan.getQualify();

            return this;
        }


        public Loan build()
        {
            return new Loan(this);
        }
    }




}
