package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UIPage extends BasePage{

    private static final int KEYBOARD_ANIMATION_DELAY = 2000;

    public UIPage(AndroidDriver driver) {
        super(driver);
    }

    /**
     *  Button Intro
     */

   @AndroidFindBy(id = app_package + "walkthrough_slider")
    public MobileElement geserlanjutButton;

    @AndroidFindBy(id = app_package + "wlk_close_button")
    public MobileElement closebannerButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id="+"\"" + app_package + "login_header\"]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
    public MobileElement closeloginButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id="+"\"" + app_package + "inapp_interstitial_image_frame_layout\"]/android.widget.ImageView[1]")
    public MobileElement closebannerwelcomeButton;

    @AndroidFindBy(id = app_package + "button_text_button")
    public MobileElement lanjutButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement allowButton;

//    @AndroidFindBy(id = app_package + "permission_allow_button")
//    public MobileElement allowButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    public MobileElement denyButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "catalog_category_recycler\"]/android.view.ViewGroup[4]/android.widget.FrameLayout[1]")
    public MobileElement indonesianflavorButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id="+"\"" + app_package + "catalog_right_layout\"]//androidx.recyclerview.widget.RecyclerView[@resource-id="+ "\"" + app_package + "catalog_list_category\"]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
    public MobileElement piliharenlatteButton;

    @AndroidFindBy(xpath = "//androidx.viewpager.widget.ViewPager[@resource-id="+"\"" + app_package + "product_detail_view_pager\"]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    public MobileElement pilihiceButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "modal_additional_recycler\"]/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.RadioButton[1]")
    public MobileElement pilihlessiceButton;

    @AndroidFindBy(xpath = "//androidx.viewpager.widget.ViewPager[@resource-id="+"\"" + app_package + "product_detail_view_pager\"]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.TextView[@text=\"SYRUP\"]")
    public MobileElement pilihsyrupButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "modal_additional_recycler\"]/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.RadioButton[1]")
    public MobileElement piliharenButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "catalog_list_category\"]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[@text='Americano']")
    public MobileElement pilihamericanoButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "catalog_list_category\"]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[@text=\"Espresso\"]")
    public MobileElement pilihespressonButton;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "catalog_list_category\"]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.TextView[@text=\"Espresso\"]/ancestor::android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[1]")
    public MobileElement hargaespresso;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id="+"\"" + app_package + "product_add_to_cart\"]/android.widget.FrameLayout[1]/android.widget.Button[1]")
    public MobileElement pilihmasukkecartButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id="+"\"" + app_package + "catalog_header\"]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView[1]")
    public MobileElement pilihcartButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id="+"\"" + app_package + "catalog_header\"]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
    public MobileElement jumlahcart;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id="+"\"" + app_package + "catalog_header\"]/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    public MobileElement searchButton;

    @AndroidFindBy(id = app_package + "search_input_text")
    public MobileElement searchField;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id="+"\"" + app_package + "search_product_list\"]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    public MobileElement pickoneButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id="+"\"" + app_package + "button_add_more\"]/android.widget.FrameLayout[1]/android.widget.Button[1]")
    public MobileElement pilihorderlagiButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id="+"\"" + app_package + "catalog_cart_summary\"]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    public MobileElement pesanButton;

    @AndroidFindBy(id = app_package + "input_text_input")
    public MobileElement noteleponField;

 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id="+"\"" + app_package + "login_card_view\"]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
 public MobileElement lanjutkanButton;

}
