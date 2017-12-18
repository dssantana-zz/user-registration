package au.net.example.userclient.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import argo.format.JsonFormatter;
import argo.format.PrettyJsonFormatter;
import argo.jdom.JsonNode;
import argo.jdom.JsonObjectNodeBuilder;
import au.net.example.userclient.UserClientApplication;

import static argo.jdom.JsonNodeBuilders.*;

@SpringBootTest(classes = UserClientApplication.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class UserAccountRegistrationControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	private static final JsonFormatter JSON_FORMATTER = new PrettyJsonFormatter();
	
	@Test
	public void should_have_a_post_message() throws Exception {
				
		JsonObjectNodeBuilder builder = anObjectBuilder() 
				.withField("firstName", aStringBuilder("Diego")) 
				.withField("lastName", aStringBuilder("Santana")) 
				.withField("email", aStringBuilder("dssantana@gmail.com")) 
				.withField("mobileNumber", aStringBuilder("0452621048"))
				.withField("ipAddress", aStringBuilder("127.0.0.1"))
				.withField("birthday", aStringBuilder("1979-10-16"))
				.withField("password", aStringBuilder("Test01")); 
		JsonNode json = builder.build();
		String content = JSON_FORMATTER.format(json);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/user-registration").contentType(MediaType.APPLICATION_JSON).content(content))
				.andExpect(MockMvcResultMatchers.status().is(200))
				.andDo(MockMvcRestDocumentation.document("user-registration"));
	}
	
}