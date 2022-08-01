import com.utility.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class deneme2testng {
    static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test(dataProvider="Authentication")
    public void aFastTest(String username, String password) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(username, password);
        Thread.sleep(4000);
    }


    @DataProvider

    public Object[][] Authentication() throws Exception{

        Object[][] testObjArray = utilities.getTableArray("C:\\Users\\kosee\\Desktop\\newexcel.xlsx","Sayfa1");

        return (testObjArray);

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
