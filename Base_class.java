package Annotetion;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ratnaglobaltech.com/");
		driver.manage().window().maximize();
		
	}
	
	

}
