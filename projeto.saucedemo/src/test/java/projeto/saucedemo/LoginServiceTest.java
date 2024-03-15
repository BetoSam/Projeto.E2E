package projeto.saucedemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

	private LoginService loginService;

	@Before
	public void setup() {
		loginService = new LoginService();
	}

	@Test
	public void testLoginSucesso() {
		String mensagemEsperada = "Login sucessful!";
		assertEquals(mensagemEsperada, loginService.login("standard_user", "secret_sauce"));

	}

	@Test
	public void testLoginUsuarioBloqueado() {
		String mensagemEsperada = "Epic sadface: Sorry, this user has been locked out.";
		assertEquals(mensagemEsperada, loginService.login("locked_out_user", "secret_sauce"));

	}

	@Test
	public void testLoginSenhaEmBranco() {
		String mensagemEsperada = "Epic sadface: Username is required";
		assertEquals(mensagemEsperada, loginService.login("", ""));

	}

	@Test
	public void testLoginUsuarioInvalido() {
		String mensagemEsperada = "Epic sadface: Username and password do not match any user in this service";
		assertEquals(mensagemEsperada, loginService.login("user1234", "pass1234"));

	}
}
