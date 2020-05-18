import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/radhaupa/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("3016 Honey Locust Drive, Euless, TX, USA");
        Thread.sleep(3000);
        WebElement autoCompleteItem = driver.findElement(By.className("pac-item"));
        autoCompleteItem.click();

        driver.quit();
    }
}
