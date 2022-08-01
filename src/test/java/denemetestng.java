import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class denemetestng {

    static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }


    @Test()
    public void aFastTest() {
        String title = driver.getTitle();
        System.out.println(title);
    }



    @Test(expectedExceptions = NumberFormatException.class)
    public void NumberTest(){
        String x = "100A";
        Integer.parseInt(x);

    }

    @Test
    public void aSlowTest() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("emre");
        Thread.sleep(2000);


    }


    @Test(invocationCount = 3)
    public void invoke() throws InterruptedException {
        System.out.println("invocationcount");


    }

    @AfterMethod
    @Parameters({"emre"})
    public void teardown(String emre) {
        System.out.println("Teardown içindeyim ");
        System.out.println(emre);
        driver.quit();
    }
}
