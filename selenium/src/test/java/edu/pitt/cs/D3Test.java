// Generated by Selenium IDE
package edu.pitt.cs;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testConnection() {
    // Test that the webserver is ready to service an HTTP request
    driver.get("http://localhost:8080/");
  }
  @Test
  public void tEST1LINKS() {
    driver.get("http://localhost:8080//");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
    driver.get("http://localhost:8080//rent-a-cat");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
    driver.get("http://localhost:8080//feed-a-cat");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
    driver.get("http://localhost:8080//greet-a-cat");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
    driver.get("http://localhost:8080//reset");
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/rent-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/feed-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/greet-a-cat\')]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST9FEED() {
    driver.get("http://localhost:8080/");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("6");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Nom, nom, nom."));
    driver.close();
  }
  @Test
  public void tEST8FEEDACAT() {
    driver.get("http://localhost:8080/");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[@onclick=\'feedSubmit()\']"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
  @Test
  public void tEST10GREETACAT() {
    driver.get("http://localhost:8080/");
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!Meow!"));
    driver.close();
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow! from Jennyanydots."));
    driver.close();
  }
  @Test
  public void tEST5RENTACAT() {
    driver.get("http://localhost:8080/");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.xpath("//input[@id=\'rentID\']"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[@onclick=\'rentSubmit()\']"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.id("returnID"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[@onclick=\'returnSubmit()\']"));
      assert(elements.size() > 0);
    }
    driver.close();
  }
  @Test
  public void tEST2RESET() {
    driver.get("http://localhost:8080/");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    driver.findElement(By.linkText("Reset")).click();
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    driver.close();
  }
}