package secound_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("HeaderMenu-link--sign-in")).click();
	}

}
