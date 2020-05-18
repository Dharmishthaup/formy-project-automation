import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/radhaupa/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement rdoBtn1 = driver.findElement(By.id("radio-button-1"));
        rdoBtn1.click();

        WebElement rdoBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        rdoBtn2.click();

        WebElement rdoBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        rdoBtn3.click();

        driver.quit();
    }
}
