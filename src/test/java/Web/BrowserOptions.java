package Web;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserOptions {


    public ChromeOptions getChromeOptions(boolean isHeadless, boolean isIncognito) {
        ChromeOptions options = new ChromeOptions();

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 12 Pro");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        if (isIncognito){
            options.addArguments("--incognito");
        }
        // Headless
        if (isHeadless) {
            options.addArguments("--disable-features=VizDisplayCompositor");
            options.addArguments("enable-automation");
            options.addArguments("--crash-dumps-dir=/tmp");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--aggressive-cache-discard");
            options.addArguments("--disable-cache");
            options.addArguments("--disable-application-cache");
            options.addArguments("--disable-offline-load-stale-cache");
            options.addArguments("--disk-cache-size=0");
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--no-proxy-server");
            options.addArguments("--log-level=3");
            options.addArguments("--silent");
            options.addArguments("--disable-browser-side-navigation");
            options.setProxy(null);
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        }
        return options;
    }
    public FirefoxOptions getFirefixOptions(boolean isHeadless, boolean isIncognito) {
        FirefoxOptions options = new FirefoxOptions();
        //Todo Add emulation device
        if (isIncognito){
            options.addArguments("--incognito");
        }
        // Headless
        if (isHeadless) {
            options.addArguments("--disable-features=VizDisplayCompositor");
            options.addArguments("enable-automation");
            options.addArguments("--crash-dumps-dir=/tmp");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--aggressive-cache-discard");
            options.addArguments("--disable-cache");
            options.addArguments("--disable-application-cache");
            options.addArguments("--disable-offline-load-stale-cache");
            options.addArguments("--disk-cache-size=0");
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--dns-prefetch-disable");
            options.addArguments("--no-proxy-server");
            options.addArguments("--log-level=3");
            options.addArguments("--silent");
            options.addArguments("--disable-browser-side-navigation");
            options.setProxy(null);
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        }
        return options;
    }
}
