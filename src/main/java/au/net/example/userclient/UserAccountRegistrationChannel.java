package au.net.example.userclient;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface UserAccountRegistrationChannel {
	String OUTBOUND_ACCOUNT_REGISTRATION_CHANNEL = "outboundAccountRegistrationChannel";

	@Output(OUTBOUND_ACCOUNT_REGISTRATION_CHANNEL)
	MessageChannel outboundAccountRegistrationChannel();
}
