import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static String title;

    public static void getTitle()
    {

        System.setProperty("webdriver.chrome.driver", "/Users/vipuljain/Desktop/Samples/seleniumPOC/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();


    }









}
