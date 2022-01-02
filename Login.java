package BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends baseClass1{
	
	
		public Login() {
        PageFactory.initElements(driver, this);	

		}
		@FindBy(id="email")
		private WebElement userName; 
		
		@FindBy(id="pass")
		private WebElement passWord;

		public WebElement getUserName() {
			return userName;
		}

		public WebElement getPassWord() {
			return passWord;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

