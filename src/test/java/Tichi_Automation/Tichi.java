package Tichi_Automation;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tichi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String EnterEmail = sc.nextLine();
		String Enternum = sc.nextLine();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));

		driver.get("https://tichi-app-webapp-stage.web.app/");

		WebElement Signin = driver.findElement(By.xpath("//button[text()='Sign In']"));

		Signin.click();

		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Enter your email address']"));

		Email.sendKeys(EnterEmail);

		WebElement Continuebtn = driver.findElement(By.xpath("//button[@type='submit']"));

		Continuebtn.click();

		WebElement FirstName = driver.findElement(By.id("firstName"));

		FirstName.sendKeys("Nisanth");

		WebElement LastName = driver.findElement(By.id("lastName"));

		LastName.sendKeys("G");

		WebElement MobileNumber = driver.findElement(By.id("phoneNumber"));

		MobileNumber.sendKeys(Enternum);

		WebElement Password = driver.findElement(By.id("password"));

		Password.sendKeys("Nishanth@1234");

		WebElement ConfirmPass = driver.findElement(By.id("confirmPassword"));

		ConfirmPass.sendKeys("Nishanth@1234");

		WebElement Checkbox = driver.findElement(By.xpath("//button[@role='checkbox']"));

		Checkbox.click();

		WebElement SignUP = driver.findElement(By.xpath("//button[@type='submit']"));

		SignUP.click();

		driver.quit();
	}
}
