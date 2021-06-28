package TestSuites;

import Config.Test_Base;
import Pages.Order.OrderOnePage;
import org.testng.annotations.Test;

public class TestSuite_ForeCofee1 extends Test_Base {

    @Test()
    public void orderitem() throws InterruptedException {
        OrderOnePage order = new OrderOnePage(driver);
        order.orderbubbleandcoffee();
        order.getcart();
    }

}
