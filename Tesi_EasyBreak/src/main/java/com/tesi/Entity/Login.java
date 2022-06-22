package com.tesi.Entity;

import org.apache.el.parser.Token;

public class Login {
   private String Email;
   private String Password;
    private org.apache.el.parser.Token Token;
    private String Error;

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public org.apache.el.parser.Token getToken() {
        return Token;
    }

    public void setToken(org.apache.el.parser.Token token) {
        Token = token;
    }
}
