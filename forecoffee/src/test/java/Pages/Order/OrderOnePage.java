package Pages.Order;

import Pages.BasePage;
import Pages.UIPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrderOnePage extends BasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 2000;

    public OrderOnePage(AndroidDriver driver) {
        super(driver);
    }

    UIPage uiobject = new UIPage((AndroidDriver) driver);
    WebDriverWait wait = new WebDriverWait(driver, 2000);


    public void introcoffee() throws InterruptedException{

        Thread.sleep(2000);

        verify_text("Selamat Datang di Fore Coffee App.");
        verify_text("Fore Coffee adalah startup kopi retail yang berkomitmen membuat kopi berkualitas premium dengan harga terjangkau untuk Indonesia");
        touchActionPointer();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.closebannerButton));
        uiobject.closebannerButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.closeloginButton));
        uiobject.closeloginButton.click();

        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.closebannerwelcomeButton));
        uiobject.closebannerwelcomeButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.lanjutButton));
        uiobject.lanjutButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.allowButton));
        uiobject.allowButton.click();
        Thread.sleep(1000);


    }

    public void orderbubbleandcoffee() throws InterruptedException {

        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.lanjutButton));
        uiobject.lanjutButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.indonesianflavorButton));
        uiobject.indonesianflavorButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.piliharenlatteButton));
        uiobject.piliharenlatteButton.click();

        Thread.sleep(1000);
        swipetobottom(1);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihiceButton));
        uiobject.pilihiceButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihlessiceButton));
        uiobject.pilihlessiceButton.click();

        Thread.sleep(1000);
        swipetobottom(2);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihsyrupButton));
        uiobject.pilihsyrupButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.piliharenButton));
        uiobject.piliharenButton.click();

        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihmasukkecartButton));
        uiobject.pilihmasukkecartButton.click();

        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.indonesianflavorButton));
        uiobject.indonesianflavorButton.click();

        swipetobottom(2);
        wait.until(ExpectedConditions.visibilityOf(uiobject.hargaespresso));
        String harga_espresso = uiobject.hargaespresso.getAttribute("text");
        //System.out.println(harga_espresso);
        String harga_expected ="Rp 17.000";
        Assert.assertEquals(harga_espresso, harga_expected);

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihespressonButton));
        uiobject.pilihespressonButton.click();

        Thread.sleep(1000);
        swipetobottom(3);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihmasukkecartButton));
        uiobject.pilihmasukkecartButton.click();

        Thread.sleep(2000);

    }

    public void getcart() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(uiobject.jumlahcart));
        String check_jml_cart = uiobject.jumlahcart.getAttribute("text");
        String jml_cart_expected ="2";
        Assert.assertEquals(check_jml_cart, jml_cart_expected);

        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihcartButton));
        uiobject.pilihcartButton.click();

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihorderlagiButton));
        uiobject.pilihorderlagiButton.click();

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.searchButton));
        uiobject.searchButton.click();

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.searchField));
        uiobject.searchField.sendKeys("Stainless Straw");

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pickoneButton));
        uiobject.pickoneButton.click();

        Thread.sleep(2000);
        scroll_text_contains("MASUK KERANJANG");
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pilihmasukkecartButton));
        uiobject.pilihmasukkecartButton.click();

        Thread.sleep(2000);
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.pesanButton));
        uiobject.pesanButton.click();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOf(uiobject.noteleponField));
        uiobject.noteleponField.sendKeys("000001");

        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(uiobject.lanjutkanButton));
        uiobject.lanjutkanButton.click();

        Thread.sleep(2000);


    }

}
