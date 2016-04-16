package cput.ac.za.bankingapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import cput.ac.za.bankingapp.factoryTest.AirtimeTest;
import cput.ac.za.bankingapp.factoryTest.DepositTest;

/**
 * Created by Scorpian on 2016-04-16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AirtimeTest.class,
        DepositTest.class
})


public class FactoryTestSuite {
}
