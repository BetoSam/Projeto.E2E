package projeto.saucedemo.api.Objects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserApi {

	private static final String BASE_URL = "https://reqres.in/";

	public static Response getUser(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/users/" + id).when().get();
	}

	public static Response createUser(String name, String job) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/users/").contentType("aplication/json")
				.body("{\name\": \"" + name + "\",\"" + job + "\"}").when().post();
	}
	public static Response deletarUser(int id) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/users/" + id).when().delete();
	}
	public static Response UpdateUser( int id ,String name, String job) {
		return RestAssured.given().baseUri(BASE_URL).basePath("api/users/").contentType("aplication/json")
				.body("{\name\": \"" + name + "\",\"" + job + "\"}").when().post();
}
}