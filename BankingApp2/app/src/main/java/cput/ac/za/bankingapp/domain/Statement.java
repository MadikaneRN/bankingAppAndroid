package cput.ac.za.bankingapp.domain;

import java.util.Date;

/**
 * Created by Scorpian on 2016-04-01.
 */


 //user has a statement, statement by itself // keep statement as entity has relationship with client
//Theres a Date
public class Statement {


    private String details;
	private String weekandDay;
	//might have toString of the relevant classes ie loan balance and account;

    public Statement(Builder builder) {

        details = builder.details;
        weekandDay = builder.weekandDay;

    }

   
	
	public String getWeekandDay()
	{	
		return weekandDay;
	}
    public String getDetails() {
        return details;
    }
    public static class Builder {

        //Equivalent to setters
        private String weekandDay;
        private String details;



        public Builder (String details)
        {
            this.details = details; //compalsury
        }

        public Builder weekandDay(String weekandDay) {
            this.weekandDay = weekandDay;
            return this;
        }



        public Builder copy(Statement statement){

            this.details = statement.getDetails();
            this.weekandDay = statement.getWeekandDay();
            return this;
        }




        public Statement build()
        {
            return new Statement(this);
        }
    }

}
