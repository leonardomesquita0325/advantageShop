package advantageshopping.business.logout;


import advantageshopping.utils.baseMethod;

public class logoutLogic extends baseMethod{
	logoutPage logPg = new logoutPage();
	
	public void clickUserCad() {
		waitElementIsClickable(logPg.getUserCadastrado());
		clickObjetoJavaScript(logPg.getUserCadastrado());	
	}
	
	public void logout() {
		waitElementIsClickable(logPg.getBtnUs());
		clickObjetoJavaScript(logPg.getBtnUs());	
	}
	public void confirLogout() {
		waitElement(logPg.getbtnFacebook());
		
	}
}
