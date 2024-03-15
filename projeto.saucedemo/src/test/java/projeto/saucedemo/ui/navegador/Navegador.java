package projeto.saucedemo.ui.navegador;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import projeto.saucedemo.ui.drivers.Drivers;

public class Navegador extends Drivers  {

	static boolean exibirNavegador = false;
	public static void iniciarTeste() {
	ChromeOptions options = new ChromeOptions();
	if(exibirNavegador) {	options.addArguments("--headless");
	
	}
	
	options.addArguments("--start-maximized");
	driver = new ChromeDriver(options);
	driver.get("http://www.saucedemo.com");
	
	}
	public  static void finalizarTeste() {
		driver.quit();
	}
}
