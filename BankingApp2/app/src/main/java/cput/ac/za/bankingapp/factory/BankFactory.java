package cput.ac.za.bankingapp.factory;


import cput.ac.za.bankingapp.domain.Bank;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class BankFactory {




    public static Bank getBank(String  name, String code)
    {
        Bank myStatement = new Bank.Builder(code) // change name to conivinient name
             .name(name)
                .build();

        return myStatement;
    }
}
