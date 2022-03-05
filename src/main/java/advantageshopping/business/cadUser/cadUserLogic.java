package advantageshopping.business.cadUser;

import java.io.IOException;

import advantageshopping.utils.Excel;
import advantageshopping.utils.baseMethod;

public class cadUserLogic extends baseMethod {
	
		cadUserPage cdUser = new cadUserPage();	
		Excel tbExcel= new Excel();
	
	public void createAccount () throws IOException {
		waitElementIsClickable(cdUser.getCreateAccount());
		clickObjetoJavaScript(cdUser.getCreateAccount());
		wait(500);
		evidencias("target/cadUser/createAcount.png");
	}
	public void userName() throws IOException {
		tbExcel.testExcelFile();
		waitElement(cdUser.getUserName());
		inputText(tbExcel.getCellData("Usuario",2),cdUser.getUserName());
		wait(500);
		evidencias("target/cadUser/userName.png");
   }
	public void Email() throws IOException {
	    waitElement(cdUser.getEmail());
		inputText(tbExcel.getCellData("Email",2),cdUser.getEmail());
		wait(500);
		evidencias("target/cadUser/Email.png");
	}
	public void passwordCad() throws IOException {
	    waitElement(cdUser.getPassWord());
		inputText(tbExcel.getCellData("Senha",2),cdUser.getPassWord());
		wait(500);
		evidencias("target/cadUser/password.png");
	}
	
	public void confirmPassword () throws IOException {
		waitElement(cdUser.getConfirmPassWord());
		inputText(tbExcel.getCellData("Senha",2),cdUser.getConfirmPassWord());
		wait(500);
		evidencias("target/cadUser/passwordConfirm.png");
	}
	public void firstName () throws IOException {
		waitElement(cdUser.getFirstName());
		inputText(tbExcel.getCellData("firstName",2),cdUser.getFirstName());
		wait(500);
		evidencias("target/cadUser/firstName.png");
	}
	
	public void lastName () throws IOException {
		waitElement(cdUser.getLastName());
		inputText(tbExcel.getCellData("lastName",2),cdUser.getLastName());
		wait(500);
		evidencias("target/cadUser/lastName.png");
	}
	
	public void phone () throws IOException {
		waitElement(cdUser.getPhoneNumber());
		inputText(tbExcel.getCellData("phone",2),cdUser.getPhoneNumber());
		wait(500);
		evidencias("target/cadUser/phone.png");
	}
	
	public void selectCountry () throws IOException {
		waitElement(cdUser.getCountry());
		selectComboBox(tbExcel.getCellData("country",2),cdUser.getCountry());
		wait(500);
		evidencias("target/cadUser/country.png");
	}
	
	public void city () throws IOException {
		waitElement(cdUser.getCity());
		inputText(tbExcel.getCellData("city",2),cdUser.getCity());
		wait(500);
		evidencias("target/cadUser/city.png");
	}
	
	public void adress () throws IOException {
		waitElement(cdUser.getConfirmPassWord());
		inputText(tbExcel.getCellData("adress",2),cdUser.getAdress());
		wait(500);
		evidencias("target/cadUser/adress.png");
	}
	
	public void state () throws IOException {
		waitElement(cdUser.getState());
		inputText(tbExcel.getCellData("state",2),cdUser.getState());
		wait(500);
		evidencias("target/cadUser/state.png");
	}
	
	public void postalCode () throws IOException {
		waitElement(cdUser.getPostalCode());
		inputText(tbExcel.getCellData("postalCode",2),cdUser.getPostalCode());
		wait(500);
		evidencias("target/cadUser/postalCode.png");
	}
	
	public void acceptConditions () throws IOException {
		waitElementIsClickable(cdUser.getCheckboxAgree());
	    Click(cdUser.getCheckboxAgree());
	    wait(500);
		evidencias("target/cadUser/acceptConditions.png");
	}
	public void notAcceptConditions () throws IOException {
		waitElementIsClickable(cdUser.getCheckboxAgree());
	    wait(500);
		evidencias("target/cadUser/acceptConditions.png");
	}
	
	public void register () throws IOException {
		waitElementIsClickable(cdUser.getRegister());
		Click(cdUser.getRegister());
		wait(500);
		evidencias("target/cadUser/register.png");
	}
	public void contFormCad () throws IOException {
		waitElement(cdUser.getRegister());
		wait(500);
		evidencias("target/cadUser/contFormCad.png");
}
	public void alreadyAccount() throws IOException {
		waitElementIsClickable(cdUser.getAlreadyAccount());
		clickObjetoJavaScript(cdUser.getAlreadyAccount());
		wait(500);
		evidencias("target/cadUser/alreadyAcount.png");
	}
}