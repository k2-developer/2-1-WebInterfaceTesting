import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppOrderTest {
    private WebDriver driver = new ChromeDriver();

    @BeforeAll
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "driver/mac/chromedriver");
    }

    @BeforeEach
//    void setUp(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//    }

//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;
//    }

    @Test
    void shouldTestForm(){
        driver.get("http://localhost:9999");
        WebElement textElements = driver.findElement(By.className("input__control"));
        textElements.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ivan");
    }
//    @Test
//    void test(){
//        driver.get("http://localhost:9999");
//        WebElement element = driver.findElement(By.id("root"));
//        String text = element.getText();
//    }

}
