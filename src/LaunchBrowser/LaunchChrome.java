package LaunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner snc = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		//launched Chrome.
		driver.get("https://www.google.com/");
		//Fetched Website.
		driver.manage().window().maximize();
		//Maximized browser.
		driver.findElement(By.name("q")).sendKeys("selenium");
		//Typed selenium.
		Thread.sleep(3000);
		//Paused 3000 milliseconds.
		driver.close();
		//closed browser.
	}

}
