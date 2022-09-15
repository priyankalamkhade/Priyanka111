package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nites\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	Thread.sleep(4000);
	
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al = new ArrayList<String>(ids);
	
	driver.switchTo().window(al.get(1));//child page
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//span[text()='HOME'])[1]")).click();
	Thread.sleep(4000);
	
	driver.switchTo().window(al.get(0));//Main page
	
	driver.findElement(By.xpath("//input[@name='home']")).click();
	Thread.sleep(4000);
	
    driver.quit();
	
	}
}
