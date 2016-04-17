package cput.ac.za.bankingapp.factory;

import cput.ac.za.bankingapp.domain.Electricity;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class ElectricityFactory {


    public static Electricity getElectricity(String meterNo, String supplierName, double amount)
    {
        Electricity myElectric = new Electricity.Builder(meterNo) // change name to conivinient name
                .supplierName(supplierName)
                .amount(amount)
                .build();
        return myElectric;
    }
}
