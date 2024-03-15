package projeto.saucedemo.api.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;
import projeto.saucedemo.api.Objects.UserApi;

public class LoginTest {
	@Test
	public void testGetUser() {
		Response response = UserApi.getUser(2);
		assertEquals(response.getStatusCode(), 200);
		String email = response.jsonPath().getString("data.email");
		System.out.println(" Email retornado " + email);
		
	}

	// @Test
	public void testCreateUser() {
		Response response = UserApi.createUser("Beto", "Qa");
		assertEquals(response.getStatusCode(), 201);
		String name = response.jsonPath().getString("name");
		String job = response.jsonPath().getString("job");
		System.out.println("nome retornado" + name);
		System.out.println("job retornado" + job);
		assertTrue(response.jsonPath().get("id") != null);
	}

	// @Test
	public void testUpdateUser() {
		Response response = UserApi.UpdateUser(2, "Beto", "Qa");
		assertEquals(response.getStatusCode(), 200);
	}

	// @Test
	public void testDeletartUser() {
		Response response = UserApi.getUser(2);
		assertEquals(response.getStatusCode(), 204);
	}
}
