package Parabank.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class GWD {

    public static ThreadLocal<WebDriver> threads = new ThreadLocal<>();
    public static WebDriverWait wait;

    public static WebDriver getDriver() {

        if (threads.get() == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            prefs.put("profile.password_manager_leak_detection", false);

            options.setExperimentalOption("prefs", prefs);

            options.addArguments("--disable-notifications");
            options.addArguments("--disable-features=PasswordLeakDetection");

            WebDriver driver = new ChromeDriver(options);

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