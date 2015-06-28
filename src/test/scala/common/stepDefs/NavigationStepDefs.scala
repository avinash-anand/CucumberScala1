package common.stepDefs

class NavigationStepDefs extends RootStepDefs {

  Given("""^I visit "(.*?)" page$"""){ (URL:String) =>
    go to URL
  }
  Then("""^I am on "(.*?)" Page$"""){ (title:String) =>
    driver.getTitle should include(title)
  }

}
