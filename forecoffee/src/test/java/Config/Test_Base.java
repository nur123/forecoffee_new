package Config;
//import Pages.Login.LoginPage;

import Pages.Order.OrderOnePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test_Base {

    protected AndroidDriver driver;
    private String dir = System.getProperty("user.dir");
    private String filepath_apk = (dir +"/src/test/java/TFile/");

    /**
     * Pilih Env Bisa Prod atau Stage
     *
     */
    public static final String env =  "coffee.fore2.fore";

    @BeforeTest
    public void setUpAppium() throws MalformedURLException {

        Object baseURI = env;
        DesiredCapabilities descap = new DesiredCapabilities();
        descap.setCapability("platformName","Android");
        descap.setCapability("deviceName","emulator-5554");
        descap.setCapability("automationName","UiAutomator2");
        // descap.setCapability("fullReset",true);
        // descap.setCapability("noReset",true);
        descap.setCapability("unicodeKeyboard", true);
        descap.setCapability("resetKeyboard", true);
        descap.setCapability("app", filepath_apk +"coffee.fore2.production.apk");
        descap.setCapability("appPackage", baseURI);
        descap.setCapability("appActivity","coffee.fore2.fore.MainActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), descap);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }



    @BeforeClass
    public void intro() throws InterruptedException {
        OrderOnePage order = new OrderOnePage(driver);
        order.introcoffee();
    }

    @AfterClass
    public void resetTest() throws InterruptedException {
        driver.quit();
    }

    @AfterTest
    void tearDownAppium() {
        driver.quit();
    }



}
