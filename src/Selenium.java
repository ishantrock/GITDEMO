import org.openqa.selenium.By;


import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		import org.openqa.selenium.JavascriptExecutor;  
		import org.openqa.selenium.WebDriver;  
		import org.openqa.selenium.chrome.ChromeDriver; 
public class Selenium {

	public static void main(String[] args) {
		 
		  
	
		           /*// System Property for Chrome Driver   
		        System.setProperty("webdriver.chrome.driver", "D:\\Study Material\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");  
		          
		             // Instantiate a ChromeDriver class.     
		        WebDriver driver=new ChromeDriver();  
		          
		           // Launch Website  
		        driver.navigate().to("http://www.javatpoint.com/");  
		          
		         //Maximize the browser  
		          driver.manage().window().maximize();  
		          
		          //Scroll down the webpage by 5000 pixels  
		        JavascriptExecutor js = (JavascriptExecutor)driver;  
		        js.executeScript("scrollBy(0, 5000)");   
		          
		         // Click on the Search button  
		        driver.findElement(By.linkText("Core Java")).click();  */   
		

		
		    /*	WebDriver wd;
			  System.setProperty("webdriver.chrome.driver","D:\\\\Study Material\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
			  wd= new ChromeDriver();
		        wd.get("http://demo.guru99.com/test/web-table-element.php");         
		        //No.of Columns
		        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		        System.out.println("No of cols are : " +col.size()); 
		        //No.of rows 
		        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
		        System.out.println("No of rows are : " + rows.size());
		        wd.close();
		    }
		*/
		  
		String s="Ishu is good boy";
		String S1= "";
		int length = s.length();
		for(int i=length-1;i>=0;i--)
			S1=S1+s.charAt(i);
		System.out.println(S1);
				
		    }  
		  
		 
}
	


