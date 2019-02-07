package com.example.demo;

import com.example.demo.proyecto.model.User;
import com.example.demo.proyecto.repositorio.UserRepository;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private final String  URL_API= "http://localhost:8095/rest/user";

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void exampleTest() {
		
	}

	@Test(timeout=3000)
	public void testGetUsers(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<User>> responseEntity =
				restTemplate.exchange(
						URL_API + "/",
						HttpMethod.GET ,
						null,
						new ParameterizedTypeReference<List<User>>(){});
		List<User> users = responseEntity.getBody();
		Assert.noNullElements(users.toArray(),"no es null");

}

	@Test(timeout=3000)
	public void testGetUser(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<User> responseEntity = restTemplate.getForEntity(URL_API+"/5c5c2e3a73697c1598d9b0dd",User.class);
	}

	@Test(timeout=3000)
	public void testPostUser(){
		RestTemplate restTemplate = new RestTemplate();

		User user = new User();
		user.setId(new ObjectId("5c5c362673697c2d2053c2fc"));
		user.setName("Pedro Picapiedra");
		user.setTelephone("8544977");

		ResponseEntity<User> responseEntity = restTemplate.postForEntity(URL_API+"/", user, User.class);
		Assert.notNull(responseEntity.getBody(),"Body is no null");
		Assert.isTrue(responseEntity.getStatusCode() == HttpStatus.OK,"Status Code");
	}

	@Test(timeout=3000)
	public void testPostUserNameNull(){
		RestTemplate restTemplate = new RestTemplate();

		User user = new User();
		user.setId(new ObjectId("5c5c362673697c2d2053c2fc"));
		user.setName("Pepito");
		user.setTelephone("8544977");

		ResponseEntity<User> responseEntity = restTemplate.postForEntity(URL_API+"/", user, User.class);
		Assert.notNull(responseEntity.getBody(),"Body is no null");
		Assert.notNull(responseEntity.getBody().getName(),"Name not null");
		Assert.isTrue(responseEntity.getStatusCode() == HttpStatus.OK,"Status Code");
	}

	@Test(timeout=3000)
	public void testPutUser(){
		RestTemplate restTemplate = new RestTemplate();
		String ID = "5c5c362673697c2d2053c2fc";

		User user = new User();
		user.setId(new ObjectId());
		user.setName("Pedro Pablo");
		user.setTelephone("8544977");

		restTemplate.put(URL_API + "/" + ID, user, User.class);
	}

	@Test(timeout=3000)
	public void testDeleteUser(){
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL_API+"/5c5c362673697c2d2053c2fc",User.class);
	}


}

