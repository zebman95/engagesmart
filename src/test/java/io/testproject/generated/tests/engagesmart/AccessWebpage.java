package io.testproject.generated.tests.engagesmart;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: EngageSmart
 * Test: Access Webpage
 * Generated by: Christopher Wamble (cwsite.ma@gmail.com)
 * Generated on Fri Aug 12 14:28:57 GMT 2022.
 */
@DisplayName("Access Webpage")
public class AccessWebpage implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("x6OtdGenIPjPU1c53S1LjlYCBDo5Cty5HVPGqe-Gndk1", new ChromeOptions(), "Christopher Wamble");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("Access Webpage")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 2. Does 'Welcome to the-internet' contain 'Welcome to the-internet'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h1[. = 'Welcome to the-internet']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Welcome to the-internet"));

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("http://the-internet.herokuapp.com/"));
  }
}