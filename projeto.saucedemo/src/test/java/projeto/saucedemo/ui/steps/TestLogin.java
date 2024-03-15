package projeto.saucedemo.ui.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import projeto.saucedemo.ui.navegador.Navegador;
import projeto.saucedemo.ui.pages.HomePage;

public class TestLogin {
HomePage hPage = new HomePage();

	@Dado("que esteja no fomulario de login")
	public void queEstejaNoFomularioDeLogin() {
	Navegador.iniciarTeste();
	}
	   
	@Quando("enviar os dados de login[")
	public void enviarOsDadosDeLogin() {
	  hPage.Login(null, null);
	}
	@Entao("tenho acesso a conta")
	public void tenhoAcessoAConta() {
	  hPage.validarLoginComSucesso();
	  Navegador.finalizarTeste();
	}



}
