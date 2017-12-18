package au.net.example.userclient.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import au.net.example.userclient.UserAccountRegistrationChannel;
import au.net.example.userclient.dto.AccountRegistration;

@Configuration
@IntegrationComponentScan
@EnableBinding(UserAccountRegistrationChannel.class)
public class UserAccountRegistration {
	
	@MessagingGateway
	public interface UserAccountRegistrationWriter {		
		@Gateway(requestChannel = UserAccountRegistrationChannel.OUTBOUND_ACCOUNT_REGISTRATION_CHANNEL)
		void UserAccountRegister (AccountRegistration newUserAccount);
	}
		
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(12);
	}
}
