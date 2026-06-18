package Parabank.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GWD {

    public static  ThreadLocal<WebDriver> threads = new ThreadLocal<>();
    public static WebDriverWait wait;

    public static WebDriver getDriver() {

        if (threads.get() == null) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            threads.set(driver);

            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }

        return threads.get();
    }

    public void quitDriver() {
        if (threads.get() != null) {
            threads.get().quit(); // Tarayıcıyı kapat
            threads.set(null);    // Hafızayı temizle
        }
    }

    public WebDriverWait getWait() {
        return wait;
    }
}