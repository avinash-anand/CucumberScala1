package common.stepDefs

import org.openqa.selenium.By

class PageStepDefs extends RootStepDefs {

  When("""^I click on "(.*?)" link on page$"""){ (linkText:String) =>
    driver.findElement(By.linkText(linkText)).click()
  }

}
