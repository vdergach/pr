import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenWebPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
//123
        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchBox.sendKeys("It Works!!!");
        searchBox.submit();
        Thread.sleep(2000);
        WebElement webSiteName = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/a/h3"));
        Thread.sleep(2000);
        Assert.assertEquals(webSiteName.getText(),"It Works!");
//123
        driver.quit();
    }
}
