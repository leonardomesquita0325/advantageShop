package advantageshopping.business.logout;


import advantageshopping.utils.baseMethod;

public class logoutLogic extends baseMethod{
	logoutPage logPg = new logoutPage();
	
	public void clickUserCad() {
		waitElementIsClickable(logPg.getUserCadastrado());
		click(logPg.getUserCadastrado());	
	}
	
	public void logout() {
		waitElementIsClickable(logPg.getBtnUs());
		click(logPg.getBtnUs());	
	}
	public void confirLogout() {
		waitIsVisibleElement(logPg.getbtnFacebook());
		
	}
}
