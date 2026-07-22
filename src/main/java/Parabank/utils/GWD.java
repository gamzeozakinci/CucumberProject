package Parabank.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class GWD {

    private static final Logger logger = LoggerFactory.getLogger(GWD.class);

    public static ThreadLocal<WebDriver> threads = new ThreadLocal<>();
    public static ThreadLocal<WebDriverWait> waitThreads = new ThreadLocal<>();

    public static WebDriver getDriver() {

        if (threads.get() == null) {
            logger.info("No driver found, creating new one");

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
            logger.info("New ChromeDriver instance created");

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            threads.set(driver);

            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
            waitThreads.set(driverWait);
            logger.debug("New WebDriverWait created");

        } else {
            logger.debug("Reusing existing driver");
        }

        return threads.get();
    }

    public void quitDriver() {
        if (threads.get() != null) {
            WebDriver driver = threads.get();
            logger.info("Quitting driver");

            driver.quit(); // Tarayıcıyı kapat
            threads.set(null);    // Hafızayı temizle
            threads.remove();     // ThreadLocal referansını tamamen temizle

            waitThreads.set(null);
            waitThreads.remove();

            logger.info("Driver quit complete and ThreadLocal cleared");
        } else {
            logger.warn("quitDriver() called but no driver was set");
        }
    }

    public static WebDriverWait getWait() {
        return waitThreads.get();
    }

}