package au.net.example.userclient;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import au.net.example.userclient.UserClientApplication;
import au.net.example.userclient.controller.UserAccountRegistrationController;
import au.net.example.userclient.dto.AccountRegistration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserClientApplication.class)
@ActiveProfiles("test")
@AutoConfigureMessageVerifier
public class BaseClass {
	
	@Autowired
	private UserAccountRegistrationController userAccountRegistrationController;
	
	@Mock
	private HttpServletRequest httpServletRequestMock;
	
	public void triggerMessage () {
		when(httpServletRequestMock.getHeader("X-Forwarded-For")).thenReturn("127.0.0.1");
				
		AccountRegistration newUserAccount = new AccountRegistration("Diego", "Santana", "0452621048", LocalDate.of(1979, 10, 16), "dssantana@gmail.com", "Test01", "127.0.0.1");		
		userAccountRegistrationController.UserAccountRegister(newUserAccount, httpServletRequestMock);
		
	}
	
	public void triggerMessageWithSpecialCharacters () {
		when(httpServletRequestMock.getHeader("X-Forwarded-For")).thenReturn("127.0.0.1");
				
		AccountRegistration newUserAccount = new AccountRegistration("Joe", "Doe", "0452621048", LocalDate.of(1979, 10, 16), "joe.doe+test@gmail.com", "Test01", "127.0.0.1");		
		userAccountRegistrationController.UserAccountRegister(newUserAccount, httpServletRequestMock);
		
	}

}
