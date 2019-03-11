package zadaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\DriversSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ultimateqa.com/filling-out-forms/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_1\"]")).sendKeys("TestName");
		
		driver.findElement(By.xpath("//*[@id=\"et_pb_contact_message_1\"]")).sendKeys("TestMessage");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/div/p/input")).sendKeys("-1");
		
		driver.findElement(By.xpath("//span[@class='et_pb_contact_captcha_question']")).getText();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/button")).click();
		
		driver.findElement(By.xpath("//span[@class='et_pb_contact_captcha_question']")).getText();
		       
		if("expected String".equals("actual string"))
		   {
		      System.out.println("Numbers are the same! ");
		   }
		 else
		  {
		      System.out.println("Numbers are changed! ");
		  }
		
		driver.close();
		
			System.out.println("Test script executed successfully.");
		
	}

	
	}

