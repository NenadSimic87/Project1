package zadaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "D:\\DriversSelenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.ultimateqa.com/filling-out-forms/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"et_pb_contact_name_1\"]")).sendKeys("TestName");
			
			driver.findElement(By.xpath("//*[@id=\"et_pb_contact_message_1\"]")).sendKeys("TestMessage");
			
			// get Math question  
			String mathquestionvalue = driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/div/p/span")).getText().trim();  
			  
			        // remove space if exist  
			        String removespace = mathquestionvalue.replaceAll("\\s+", "");  
			        // get two numbers   
			        String[] parts = removespace.split("\\+");  
			        String part1 = parts[0];  
			        String part2 = parts[1];  
			        String[] parts1 = part2.split("\\=");  
			        String part11 = parts1[0];  
			  
			        // sum two numbers  
			int summation = Integer.parseInt(part1) + Integer.parseInt(part11);  
			  
			        // Math Capcha value  
			        WebElement capta = driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/div/p/input"));  
			        capta.clear();  
			        capta.sendKeys("" + summation); ;
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div[2]/form/div/button")).click();
			
				Thread.sleep(3000);
				
			WebElement msg=driver.findElement(By.xpath("/html/body/div[1]/div/div/article/div/div[1]/div/div/div/div[2]/div/div/p"));
			String text=msg.getText();
			if (msg.isEnabled() && text.contains("Success"))
			{ 
			    System.out.println("Success message is displayed!");
			}else{
			    System.out.println("Success message is not displayed!");
			}
			
			driver.close();
			
			System.out.println("Test script executed successfully.");
		
	}

}
