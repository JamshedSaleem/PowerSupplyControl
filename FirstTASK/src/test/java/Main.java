import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {
    public static void main(String[] args)
    {
        System.out.print("Welcome");

        WebDriver baseDriver;
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        baseDriver = new ChromeDriver(co);
        System.out.print("Welcome");
        //baseDriver.manage().timeouts().pageLoadTimeout(Long.valueOf(60), TimeUnit.SECONDS);
        System.out.print("Welcome");
        //baseDriver.manage().timeouts().implicitlyWait(Integer.valueOf(60), TimeUnit.SECONDS);
        String URL ="www.google.com";
        baseDriver.get(URL);
       // baseDriver.findElement(By("login")).click();
        baseDriver.findElement(By.id("scpi")).sendKeys("ALLON");baseDriver.findElement(By.name("Submit")).click();

    }
}
