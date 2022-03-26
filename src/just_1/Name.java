package just_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\chrome\\chromedriver.exe");
   
      WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.lenskart.com/");

	}

}
