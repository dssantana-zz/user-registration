package au.net.example.userclient.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRegistration {
	
	private String firstName;
	private String lastName;
	private String email;	
	private String mobileNumber;
	private String ipAddress;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate birthday;	
	private String password;
	
	public AccountRegistration(String firstName, String lastName, String mobileNumber, LocalDate birthday,
			String email, String password, String ipAddress) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.ipAddress = ipAddress;
		this.birthday = birthday;
		this.email = email;
		this.password = password;
	}

}
