package session6_sugith;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;

public interface Wrappers {
	
	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param Locator - id of the webelement
	 * @param testData - The data to be sent to the webelement
	 * @author Mithra
	 * @return - void
	 * @throws IOException 
	 * @throws WebDriverException 
	 * @date - Feb 11, 2022
	 */
	
	public void enterById(String Locator, String testData) throws WebDriverException, IOException;
	
	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param Locator - xpath of the webelement
	 * @param testData - The data to be sent to the webelement
	 * @author Mithra
	 * @return - void
	 * @date - Feb 11, 2022
	 */
	
	public void enterByXpath(String Locator, String testData);
	
	public void enterByClass(String Locator, String testData);
	
	public void enterByName(String Locator, String testData);

}
