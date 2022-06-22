package com.tesi;

import com.tesi.Service.LoginService;
import com.tesi.Service.PasswordService;
import com.tesi.Service.RegistrationService;
import com.tesi.Utility.CreateToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;


@SpringBootApplication()
public class TesiEasyBreakApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException {
		SpringApplication.run(TesiEasyBreakApplication.class, args);

		CreateToken c = new CreateToken();
		LoginService l = new LoginService();
		System.out.println(l.checkUser("lu@mail.com", "Polletto99"));






	}

}
