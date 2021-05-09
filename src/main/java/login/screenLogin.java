package login;

import _Core.baseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class screenLogin extends baseScreen {

	public screenLogin() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_usuario")
	private MobileElement idDoUsuario;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
	private MobileElement senha;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_logar")
	private MobileElement logar;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/mensagem_erro_login")
	private MobileElement usuarioSenhaInvalidos;
	
	
	public void idDoUsuario (String text) {
		
		sendKeys(idDoUsuario, text);
	}
	
	public void senha (String text) {
		
		sendKeys(senha, text);
	}
	
	public void logar () {
		
		click(logar);
	}
	
	public String validaUsuarioSenhaInvalidos () {
		
		return usuarioSenhaInvalidos.getText();
		
	}
	

}
