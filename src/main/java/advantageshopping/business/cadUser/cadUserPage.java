package advantageshopping.business.cadUser;

import org.openqa.selenium.By;

public class cadUserPage {

	private By createAccount = By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]");
	private By userName = By.xpath("//input[@name='usernameRegisterPage']");
	private By email = By.xpath("//input[@name='emailRegisterPage']");
	private By passWord = By.xpath("//input[@name='passwordRegisterPage']");
	private By confirmPassWord = By.xpath("//input[@name='confirm_passwordRegisterPage']");
	private By firstName = By.xpath("//input[@name='first_nameRegisterPage']");
	private By lastName = By.xpath("//input[@name='last_nameRegisterPage']");
	private By phoneNumber = By.xpath("//input[@name='phone_numberRegisterPage']");
	private By country = By.xpath("//select[@name='countryListboxRegisterPage']");
	private By city = By.xpath("//input[@name='cityRegisterPage']");
	private By adress = By.xpath("//input[@name='addressRegisterPage']");
	private By state = By.xpath("//input[@name='state_/_province_/_regionRegisterPage']");
	private By postalCode = By.xpath("//input[@name='postal_codeRegisterPage']");
	private By checkboxAgree = By.xpath("//input[@name='i_agree']");
	private By register = By.xpath("//*[text()='REGISTER']");
	private By alreadyAccount = By.xpath("//a[contains(text(),'ALREADY HAVE AN ACCOUNT?')]");
	
	public By getCreateAccount() {
		return createAccount;
	}

	public By getUserName() {
		return userName;
	}

	public By getEmail() {
		return email;
	}

	public By getPassWord() {
		return passWord;
	}

	public By getConfirmPassWord() {
		return confirmPassWord;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getPhoneNumber() {
		return phoneNumber;
	}

	public By getCountry() {
		return country;
	}

	public By getCity() {
		return city;
	}

	public By getAdress() {
		return adress;
	}

	public By getState() {
		return state;
	}

	public By getPostalCode() {
		return postalCode;
	}

	public By getCheckboxAgree() {
		return checkboxAgree;
	}

	public By getRegister() {
		return register;
	}
	public By getAlreadyAccount() {
		return alreadyAccount;
	}
}
