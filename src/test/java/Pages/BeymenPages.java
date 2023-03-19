package Pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import Util.DriverFactory;
import Util.ElementHelper;
import io.appium.java_client.*;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BeymenPages {
    AndroidDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public BeymenPages(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    By denyButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_deny_button\")");
    By searchButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/navigation_search\")");
    By womenButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/ivCategory\")");
    By sheosButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/ivCategory\")");
    By sneakersButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/FLSubItem\")");
    By sortViewButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/sortView\")");
    By priceIn = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fiyata Göre Artan\")");
    By filterButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/filterView\")");
    By brandButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/rlFilterItem\")");
    By boxSendkeys1 = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/etSearchFilterAttribute\")");
    By nikeSelect = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Nike\")");
    By colorButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By boxSendkeys2 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk arayın\")");
    By redSelect = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/tv_attribute_title\")");
    By sizeButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Beden\")");
    By boxSendkeys3 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Beden arayın\")");
    By thirteenEightSelect = MobileBy.AndroidUIAutomator("new UiSelector().text(\"38\")");
    By productListButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/btn_apply_filter\")");
    By productClick = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/productImage\")");
    By addToCart = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/addToCartButton\")");
    By sizeClick = MobileBy.AndroidUIAutomator("new UiSelector().text(\"38\")");
    By verifyAddToCartProduct = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
    By goToCart = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
    By verifyProduct = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/tvBasketDisplayName\")");
    By productTotals = MobileBy.AndroidUIAutomator("new UiSelector().text(\"1,849.00 TL\")");
    By totalDiscount = MobileBy.AndroidUIAutomator("new UiSelector().text(\"-450.00 TL\")");
    By shippingFee = MobileBy.AndroidUIAutomator("new UiSelector().text(\"0.00 TL\")");
    By amountPay = MobileBy.AndroidUIAutomator("new UiSelector().text(\"1,399.00 TL\")");
    By deleteButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.mobisoft.beymen:id/tvDeleteBasketItem\")");
    By deleteProductVerify = MobileBy.AndroidUIAutomator("new UiSelector().textMatches(\"Sepetiniz Boş\")");










    public void denyButton() {
        driver.findElement(denyButton).click();
    }

    public void searchButton() {
        driver.findElement(searchButton).click();
    }

    public void womenButton() {
        List<WebElement> elementList = driver.findElements(womenButton);
        elementList.get(0).click();
    }

    public void shoesButton() {
        List<WebElement> elementList = driver.findElements(sheosButton);
        elementList.get(2).click();
    }

    public void sneakerButton() {
        List<WebElement> elementList = driver.findElements(sneakersButton);
        elementList.get(2).click();
    }

    public void sortViewButton() {
        driver.findElement(sortViewButton).click();
    }

    public void priceIn() {
        driver.findElement(priceIn).click();
    }

    public void filterButton() {
        driver.findElement(filterButton).click();
    }

    public void brandButton() {
        List<WebElement> elementList = driver.findElements(brandButton);
        elementList.get(1).click();
    }

    public void BoxSendkeys1() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(boxSendkeys1).click();
        Thread.sleep(2000);
        driver.findElement(boxSendkeys1).sendKeys("Nike");
    }

    public void nikeSelect() {
        List<WebElement> elementList = driver.findElements(nikeSelect);
        elementList.get(1).click();
    }

    public void colorbutton() {
        driver.findElement(colorButton).click();
    }

    public void BoxSendkeys2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(boxSendkeys2).sendKeys("kirmizi");
    }

    public void redSelect() {
        driver.findElement(redSelect).click();
    }

    public void sizeButton() {
        driver.findElement(sizeButton).click();
    }

    public void BoxSendkeys3() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(boxSendkeys3).sendKeys("38");
    }

    public void thirteenEightSelect() {
        List<WebElement> elementList = driver.findElements(thirteenEightSelect);
        elementList.get(1).click();
    }

    public void productListButton() {
        driver.findElement(productListButton).click();
    }

    public void productClick() {
        driver.findElement(productClick).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public void sizeClick() {
        driver.findElement(sizeClick).click();
    }

    public void verifyAddToCartProduct() {
        elementHelper.checkVisible(verifyAddToCartProduct);
    }

    public void goToCart() {
        driver.findElement(goToCart).click();
    }

    public void verifyProduct() {
        elementHelper.checkVisible(verifyProduct);
    }

    public void specialListVerify() throws InterruptedException {
        Thread.sleep(3000);

        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        int endy = (int) (size.height * 0.20);
        int startx = size.width / 2;
        new TouchAction(driver).press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startx, endy)).release().perform();


        //  driver.findElement(
        //      new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
        //        + ".scrollIntoView(new UiSelector()" + ".resourceId(\"" + "com.mobisoft.beymen:id/tvShowCartSummaryDetail" + "\").instance(0))"));


        Thread.sleep(2000);

        elementHelper.checkVisible(productTotals);
        elementHelper.checkVisible(totalDiscount);
        elementHelper.checkVisible(shippingFee);
        elementHelper.checkVisible(amountPay);

        Thread.sleep(2000);

        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
                        + ".scrollIntoView(new UiSelector()" + ".resourceId(\"" + "com.mobisoft.beymen:id/tvDeleteBasketItem" + "\").instance(0))"));


    }

    public void deleteButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(deleteButton).click();
    }

    public void deleteProductVerify(){
        elementHelper.checkVisible(deleteProductVerify);
    }

}

