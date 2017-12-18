package au.net.example.userclient.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import au.net.example.userclient.config.UserAccountRegistration.UserAccountRegistrationWriter;
import au.net.example.userclient.dto.AccountRegistration;
import au.net.example.userclient.helper.UserClient;

@RestController
@RequestMapping ("/user-registration")
public class UserAccountRegistrationController {
	
	private final UserAccountRegistrationWriter userAccountRegistrationWriter;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountRegistrationController.class);
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ConfigurableEnvironment env;
	
	@Autowired
	public UserAccountRegistrationController(UserAccountRegistrationWriter userAccountRegistrationWriter) {
		
		this.userAccountRegistrationWriter = userAccountRegistrationWriter;
		
	}
		
	@RequestMapping (method = RequestMethod.POST)
	public void UserAccountRegister(@RequestBody AccountRegistration newUserAccount, HttpServletRequest request) {
		
		String encryptedPassword = this.setPassword(newUserAccount.getPassword());
		newUserAccount.setPassword(encryptedPassword);
		newUserAccount.setIpAddress(UserClient.getClientIP(request));		
		LOGGER.info("UserAccountRegistrationController - UserAccountRegister: "+ newUserAccount.toString());		
		this.userAccountRegistrationWriter.UserAccountRegister(newUserAccount);
		
	}

	private String setPassword(String password) {
		/*if (env.getActiveProfiles()[0].toLowerCase().contains("test")) {
			return password;
		}*/
		return passwordEncoder.encode(password);
	}
}
