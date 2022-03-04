package advantageshopping.business.logUser;



import java.io.IOException;

import advantageshopping.utils.Excel;
import advantageshopping.utils.baseMethod;

public class logUserLogic extends baseMethod {
		logUserPage logUser = new logUserPage();
		Excel tbexcel = new Excel();
		
	
	public void User () throws IOException {
		tbexcel.testExcelFile();
		waitElement(logUser.getCmpUserName());
		inputText(tbexcel.getCellData("Usuario",1),logUser.getCmpUserName());
		wait(500);
		evidencias("target/logUser/user.png");
	}
	
	public void Password () throws IOException {
		waitElement(logUser.getCmpSenha());
		inputText(tbexcel.getCellData("Senha", 1), logUser.getCmpSenha());
		wait(500);
		evidencias("target/logUser/password.png");
	}
	
	public void clickLogin () throws IOException {
		waitElementIsClickable(logUser.getBtnLogar());
		Click(logUser.getBtnLogar());
		wait(800);
		evidencias("target/logUser/clickBotao.png");
	}
	
	
}
