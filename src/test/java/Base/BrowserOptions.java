package Base;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {
    ChromeOptions options;

    public ChromeOptions getOptions(boolean isHeadless, boolean isIncognito) {
        options = new ChromeOptions();
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
