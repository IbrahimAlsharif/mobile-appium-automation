package Base;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import jdk.jfr.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Ibrahim
 */
public class Shot {

    private final WebDriver driver;
    private final String shotsPath;
    private Description description;
    public Shot(WebDriver driver) {
        this.driver = driver;
        shotsPath = "Bugs-shots";
    }

    public File snapError(String shotName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File shot= new File(shotName+getCurrentTime() +".png");
        try {
            FileUtils.copyFile(scrFile, shot);
        } catch (IOException ex) {
            Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shot;
    }

    public void snapStep() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(stepShotName()));
        } catch (IOException ex) {
            Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void manualSnapStep() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(stepShotName()));
        } catch (IOException ex) {
            Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public String stepShotName() {
        return shotsPath + "\\@" + getCurrentTime() + ".png";
    }

    public String getCurrentTime() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss-S");
        return (simpleDateFormat.format(date));
    }


}

