package Opening_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcodersContact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vaishnavi Patil\\eclipse-workspace\\Testing_ecoders\\all_jars\\chromedriver.exe");
		//open the browser
		WebDriver driver = new ChromeDriver();
		//navigate to website
		driver.get("http://127.0.0.1:5000/contact");
		//get the title
		 String titleofpage=driver.getTitle();
		 System.out.println(titleofpage);
		 Thread.sleep(1000);
		 //get the current url
		 String currenturl=driver.getCurrentUrl();
		 System.out.println(currenturl);
		 Thread.sleep(1000);
	     //To get page source
		 String pagesource =driver.getPageSource();
		 System.out.println(pagesource);
		 String expectedtitle="ECODERS-contactpage";
		 if(expectedtitle.equals(titleofpage)) {
			 System.out.println("Title matched test case passed");
		 }
		 else {
			 System.out.println("Title did not matched test case failed");
		 }
		 
//		
		driver.quit();//close the browser
	}

}
