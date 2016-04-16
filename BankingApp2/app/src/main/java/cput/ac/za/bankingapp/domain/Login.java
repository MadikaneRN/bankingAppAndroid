package cput.ac.za.bankingapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Scorpian on 2016-04-01.
 */

@Entity
@Table(name ="LOGIN")
public class Login {

    @Id
    @Column(name ="USER_NAME")
    private String userName;
    @Column(name = "PASSWORD")
    private String passWord;


    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public Login(Builder builder) {

        userName = builder.userName;
        passWord = builder.passWord;

    }


    public static class Builder {

        //Equivalent to setters
        private String passWord;
        private String userName;


        public Builder (String userName)
        {
            this.userName = userName; //compalsury
        }

        public Builder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }


        public Builder copy(Login login){

            this.userName =login.getUserName();
            this.passWord = login.getPassWord();

            return this;
        }

        public Login build() {
            return new Login(this);
        }
    }





}
