package advantageshopping.utils;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class baseMethod extends navegacao{
	
	public void evidencias(String local) throws IOException {
		File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(printFinal, new File(local));
	}
	public void findElement (By element) {
		driver.findElement(element);
	}
	public void Click(By element) {
		driver.findElement(element).click();
	}
	public void waitElementIsClickable (By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void wait (int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void waitElement(By element) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public Object executeJS (String sj, Object pr) { 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(sj, pr);
	}
	
	public void clickObjetoJavaScript (By valor) {
		waitElement(valor);
		WebElement element = driver.findElement(valor);
		wait(5000);
		executeJS("javascript:void(0)", element);
		element.click();
	}
	
	public void clearText(By element) {
		driver.findElement(element).clear();
		
	}
	public void inputText(String valor,By element) {
		clearText(element);
		driver.findElement(element).sendKeys(valor);
	}
	
	public void selectComboBox(String Text,By valor) {
		Select combo = new Select(driver.findElement(valor));
		combo.selectByVisibleText(Text);
	}
}
