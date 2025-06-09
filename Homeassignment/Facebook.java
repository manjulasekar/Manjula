package Homeassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		 
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("manjusekar10@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("manjula@1995");
		driver.findElement(By.name("login")).click();
		System.out.println("selected login button");
		//driver.close();
}
}