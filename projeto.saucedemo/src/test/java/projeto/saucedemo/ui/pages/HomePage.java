package projeto.saucedemo.ui.pages;

import projeto.saucedemo.ui.elementos.Elementos;
import projeto.saucedemo.ui.metodos.Metodos;

public class HomePage {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void Login(String username, String password) {
		metodo.escrever(el.username, "standard_user");
		metodo.escrever(el.password, "secret_sauce");
		metodo.clicar(el.BtnLogin);
	}

	public void validarLoginComSucesso() {
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");
	}
	public void validarMensagemErroLogin() {
		
	}
}
