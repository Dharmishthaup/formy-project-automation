import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/radhaupa/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement btn = driver.findElement(By.id("new-tab-button"));
        btn.click();
        String origHandle = driver.getWindowHandle();

        for(String handle1 : driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(origHandle);
        driver.quit();
    }
}
