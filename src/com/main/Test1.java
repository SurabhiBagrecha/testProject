package com.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get(baseUrl + "/testProject/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.name("textfield")).clear();
    driver.findElement(By.name("textfield")).sendKeys("tty");
    driver.findElement(By.name("textfield2")).clear();
    driver.findElement(By.name("textfield2")).sendKeys("tyty");
    driver.findElement(By.name("SignUP")).click();
  }

  
}
