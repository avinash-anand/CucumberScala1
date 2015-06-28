package common.stepDefs

import common.drivers.Driver
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.WebDriver
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser

trait RootStepDefs extends ScalaDsl with WebBrowser with EN with Matchers {

  implicit val driver: WebDriver = Driver.webDriver

}
