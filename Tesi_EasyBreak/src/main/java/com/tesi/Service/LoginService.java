package com.tesi.Service;

import com.jdbcConnection;
import com.tesi.Entity.User;
import com.tesi.Utility.CreateToken;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {


       public String checkUser(String email, String password) throws SQLException, ClassNotFoundException {
           String query = "Select * from User where email = ?";
           jdbcConnection conn = jdbcConnection.getInstance();
           PreparedStatement myState;
           myState = conn.getConnection().prepareStatement(query);
           myState.setString(1, email);
           ResultSet myRes = myState.executeQuery();
           PasswordService pass = new PasswordService();
           String passordEncoded= pass.encryptPassword(password, "Vin0DellaCas4");
           if(!myRes.next())
               return ("Non esiste questo utente");
           else {
                   User u = new User(myRes.getLong("id"), myRes.getString("name"), myRes.getString("surname"), myRes.getString("email"), myRes.getString("password"), myRes.getBoolean("enabled"));
               if (u.getPassword().equals(passordEncoded) ) {
                   CreateToken token = new CreateToken();
                   return token.generateToken();
               }
               else return "Password errata";
               }

           }



    public LoginService() throws SQLException, ClassNotFoundException {
    }
}
