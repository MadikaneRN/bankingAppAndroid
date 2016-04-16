package cput.ac.za.bankingapp.factory;

import cput.ac.za.bankingapp.domain.Loan;


import java.util.Date;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class LoanFactory {



    public static Loan getLoan(String userId, double loanAmount,double salary,boolean qualify,Date currentDate)
    {
        Loan myLoan = new Loan.Builder(userId) // change name to conivinient name
                .loanAmount(loanAmount)
                .salary(salary)
                .qualify(qualify)
                .currentDate(currentDate)
                .build();

        return myLoan;
    }

}
