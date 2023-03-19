package StepDefinitions;

import Pages.BeymenPages;
import Util.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeymenStepDefinitions  {

    BeymenPages pages= new BeymenPages(DriverFactory.getDriver());
    @Given("Navigate to Beymen App")
    public void navigateToBeymenApp() {
        pages.denyButton();
    }

    @And("Click on search")
    public void clickOnSearch() {
        pages.searchButton();
    }

    @And("Click on the women section")
    public void clickOnTheWomenSection() {
        pages.womenButton();
    }

    @And("Click on the shoes section")
    public void clickOnTheShoesSection() {
        pages.shoesButton();
    }

    @And("Click on the Sneakers section")
    public void clickOnTheSneakersSection() {
        pages.sneakerButton();
    }

    @And("Click on sort by section")
    public void clickOnSortBySection() {
        pages.sortViewButton();
    }

    @And("Click on the button that increases by price from here")
    public void clickOnTheButtonThatIncreasesByPriceFromHere() {
        pages.priceIn();
    }

    @And("Click on the filter button")
    public void clickOnTheFilterButton() {
        pages.filterButton();
    }

    @And("Search and select Nike in the Brand section")
    public void searchAndSelectNikeInTheBrandSection() throws InterruptedException {
        pages.brandButton();
        pages.BoxSendkeys1();
        pages.nikeSelect();
    }

    @And("Search and select Red from the Color section")
    public void searchAndSelectRedFromTheColorSection() throws InterruptedException {
        pages.colorbutton();
        pages.BoxSendkeys2();
        pages.redSelect();

    }

    @And("Search and select thirty-eight from the size section")
    public void searchAndSelectThirtyEightFromTheSizeSection() throws InterruptedException {
        pages.sizeButton();
        pages.BoxSendkeys3();
        pages.thirteenEightSelect();
    }

    @And("Click the list products button")
    public void clickTheListProductsButton() {
        pages.productListButton();
    }

    @And("Click the Add to Cart button that comes with the product.")
    public void clickTheAddToCartButtonThatComesWithTheProduct() {
        pages.productClick();
        pages.addToCart();
    }

    @And("Please select the body type displayed here")
    public void pleaseSelectTheBodyTypeDisplayedHere() {
        pages.sizeClick();
    }

    @And("Verify that the product has been added to your cart")
    public void verifyThatTheProductHasBeenAddedToYourCart() {
        pages.verifyAddToCartProduct();
    }

    @And("Click the Go To Cart button")
    public void clickTheGoToCartButton() {
        pages.goToCart();
    }

    @And("Verify your product")
    public void verifyYourProduct() {
        pages.verifyProduct();
    }

    @When("Verify the Total of Items, Total Discount, Shipping fee and Amount Payable section in the Shopping summary below")
    public void verifyTheTotalOfItemsTotalDiscountShippingFeeAndAmountPayableSectionInTheShoppingSummaryBelow() throws InterruptedException {
        pages.specialListVerify();
    }

    @Then("Delete the product from the cart and verify that the product has been deleted")
    public void deleteTheProductFromTheCartAndVerifyThatTheProductHasBeenDeleted() throws InterruptedException {
        pages.deleteButton();
        pages.deleteProductVerify();
    }
}
