package projeto.saucedemo.ui.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import projeto.saucedemo.ui.drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void validarUrl(String url) {
		try {
			assertEquals(driver.getCurrentUrl(), url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
