package commindtree.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! i mlearning selenium" );
        String path =  ("D:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 5");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        driver.findElement(By.xpath("//h2[@data-attribute='OnePlus 6 (Mirror Black, 8GB RAM + 128GB memory)']")).click();;
        
        
      //*[@id="nav-search"]/form/div[2]/div/input
        
    }
}
