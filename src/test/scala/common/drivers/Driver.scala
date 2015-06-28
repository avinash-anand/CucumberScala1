package common.drivers

import org.openqa.selenium.WebDriver

import scala.util.Try

trait Driver {

  implicit val webDriver:WebDriver = Browsers.createChromeDriver
  //implicit val webDriver:WebDriver = Browsers.createFirefoxDriver

  sys.addShutdownHook(Try(webDriver.quit()))

}

object Driver extends Driver
