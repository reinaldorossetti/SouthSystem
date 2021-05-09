package compras;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import _Core.baseScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class screenCompras extends baseScreen {

	public screenCompras() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/detalhes_produto_botao_comprar")
	private MobileElement comprar;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'N�mero cart�o']")
	private MobileElement numeroCartao;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Data de validade']")
	private MobileElement dataValidade;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'CVC']")
	private MobileElement cvc;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento")
	private MobileElement confirmarPagamento;
	
	public void produto (String text) {
		
		String MobileElement = "//androidx.recyclerview.widget.RecyclerView[@resource-id = 'br.com.alura.aluraesporte:id/lista_produtos_recyclerview']//*[contains(@text,'"+text+"')]/..";
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(MobileElement))).click();
	}
	
	public void comprar () {
		
		click(comprar);
	}
	
	public void numeroCartao (String text) {
		
		sendKeys(numeroCartao, text);		
	}
	
	public void dataValidade (String text) {
		
		sendKeys(dataValidade, text);		
	}
	
	public void cvc (String text) {
		
		sendKeys(cvc, text);		
	}
	
	public void confirmarPagamento () {
		
		click(confirmarPagamento);
	}
	
	
}
