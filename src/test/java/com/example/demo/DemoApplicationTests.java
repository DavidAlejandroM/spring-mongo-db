package com.example.demo;

import com.example.demo.proyecto.model.User;
import com.example.demo.proyecto.repositorio.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private final String  URL_API= "http://localhost/rest/user";

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void exampleTest() {
		
	}

	@Test(timeout=3000)
	public void testPostRides(){
		RestTemplate restTemplate = new RestTemplate();

		User user = new User(45, "Migue", "3004334345");
		Object userResponse = new Object();
		restTemplate.put(URL_API+"/",user);
	}
}

