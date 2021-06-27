package Pages;

import Config.Test_Base;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.HashMap;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class BasePage extends Test_Base {
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 1000;
    public static final String app_package = env + ":id/";

    protected final AppiumDriver driver;

    private WebElement element;

    protected BasePage(AppiumDriver driver) {
        this.driver = driver;
        // PageFactory.initElements(new AppiumFieldDecorator(driver, 120, TimeUnit.SECONDS), this);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(120)), this);
    }


    public WebElement scroll_text_contains(String text) {
        return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + text + "\"));"));
    }
    public WebElement verify_text(String Text) {
        return driver.findElement(MobileBy.xpath("//android.widget.TextView[@text =" + "\"" + Text + "\"]"));
    }

    public void touchActionPointer() {
        int heightOfScreen = driver.manage().window().getSize().getHeight();
        int widthOfScreen = driver.manage().window().getSize().getWidth();

        int x = (int) (widthOfScreen * 0.115);
     //   System.out.println(x);
        int y = (int) (heightOfScreen * 0.92);
     //   System.out.println(y);
        int end_x = (int) (widthOfScreen * 0.916);
     //   System.out.println(end_x);
        int end_y = y;

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(x, y))
                .waitAction(waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(end_x, end_y))
                .release()
                .perform();
    }

    public void swipetobottom(int n) {
        Dimension size = driver.manage().window().getSize();
        TouchAction action = new TouchAction(driver);
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.5);
        int endY = (int) (size.width * 0.2);
        for (int i = 1; i <= n; i++) {
            action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(startX, endY)).release().perform();
        }

    }
}
