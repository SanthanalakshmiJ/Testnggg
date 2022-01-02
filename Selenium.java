package BaseClass;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Selenium extends baseClass1 {

	public static void main(String[] args) throws IOException {

		chromeBrowser();

		driver.get("https://www.facebook.com/");
		impWait(5);

		// screenShot(OutputType.FILE, "Facebk");

		Login l = new Login();
		sendkeys(l.getUserName(), "Magesh");
		sendkeys(l.getPassWord(), "1234565");

	}

}
