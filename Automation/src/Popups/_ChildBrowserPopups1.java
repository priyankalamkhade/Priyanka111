package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _ChildBrowserPopups1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\nites\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	Thread.sleep(4000);
	
	String idOfMainPage = driver.getWindowHandle();
	System.out.println(idOfMainPage);//CDwindow-CF22350C8B60F637CF3863724941B0CD

	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al = new ArrayList<String>(ids);
	
	System.out.println(al.get(0));//get id of main page
	
	System.out.println(al.get(1));//get id of child page
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
}
