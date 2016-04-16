
package cput.ac.za.bankingapp.factoryTest;
import junit.framework.Assert;
import cput.ac.za.bankingapp.domain.Statement;
import cput.ac.za.bankingapp.factory.StatementFactory;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;


/**
 * Created by Scorpian on 2016-04-03.
 */
public class StatementTest {

	private Statement statement;

    @Before

    public void setUp() throws Exception {

        statement = StatementFactory.getStatement("Summary",null);

    }


    @Test
    public void testLogin() throws Exception {

        Assert.assertNotNull(statement);
        Assert.assertEquals(statement.getDetails(), "Summary");
        //Assert.assertEquals(statement.getWeekandDay(null),null); //deleteTest


    }
    //not gna use
    @Test
    public void testUpdate() throws Exception {
        Statement statementUpdate = new Statement.Builder("eminem")// uses accNo as primary key
                .copy(statement)
				.weekandDay("week44 monday")
                .build();

        Assert.assertNotNull(statementUpdate);
       // Assert.assertEquals(statementUpdate.getweekandDay,"week44 monday");


    }








}
