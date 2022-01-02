package BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass1  {
	
	static WebDriver driver;


	// Browser Launch

	public static WebDriver chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
		
	}
	
	//UrlLaunch
	public static void urlLaunch(String url) {
		driver.get(url);

	}

	
	//Implicitly Time
	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	
	//Maximize
	public static void maximize() {
		driver.manage().window().maximize();
     }
	
	
	//Current Url
	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	//getTitle
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	
	//sendkeys
	public static void sendkeys(WebElement e,String s) {
		e.sendKeys(s);
    }
	
	//Quit
	public static void quit() {
		driver.quit();

	}
	
	//Action Click
	public static void actionClick(WebElement w) {
		Actions a = new Actions(driver);
		a.click(w).perform();

	}
	
	//moveToElement
	public static void moveToElement(WebElement m) {
		Actions a = new Actions(driver);
		a.moveToElement(m).perform();

		}
	
	//dragAndDrop
	public static void dragAndDrop(WebElement move, WebElement to) {
		Actions a = new Actions(driver);
        a.dragAndDrop(move, to).perform();

        }
	
	//contextClick
	public static void contextClick() {
		Actions a = new Actions(driver);
		a.contextClick().perform();

	}
	
	//doubleClick
	public static void doubleClick(WebElement s) {
		Actions a = new Actions(driver);
        a.doubleClick(s).perform();

	}
	
	//alertAccept
	public static void alertAccept() {
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		}
	
	//alertdismiss
	public static void alertdismiss() {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}
	//prompt alert
	private void promptAlert() {
		Alert a1 = driver.switchTo().alert();
        
	}
	
	//DropDown selectByIndex
	public static void selectByIndex(WebElement d, int index) {
        Select s=new Select(d);
        s.selectByIndex(index);

	}
	
	//selectByValue	
	public static void selectByValue(WebElement d,String a) {
        Select s=new Select(d);
        s.selectByValue(a);
	
	}
	
    //selectByVisibleText	
	public static void selectByVisibleText(WebElement d,String b) {
        Select s=new Select(d);
        s.selectByVisibleText(b);
        
	}
	
	//screenShot
	public static void screenShot(String name) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File from = tk.getScreenshotAs(OutputType.FILE);
	File to=new File("C:\\Users\\Lakshimi\\eclipse-workspace\\Maven\\src\\test\\resources"+name+".png");
	FileUtils.copyFile(from, to);
    }
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
