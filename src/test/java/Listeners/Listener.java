package Listeners;

import Base.Shot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;
import org.testng.ITestListener ;
import org.testng.ITestResult ;

public class Listener implements ITestListener {
    Shot shot;
    public void Listeners(WebDriver driver){
        shot= new Shot(driver);
}
    @Override
    public void onFinish(ITestContext Result)
    {
//        shot= new Shot(Initialization.driver);
//        shot.snapError();
    }

    @Override
    public void onStart(ITestContext Result)
    {
        System.out.println("Started "+Result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
    {

    }

    @Override
    public void onTestFailure(ITestResult Result)
    {
        System.out.println("FAILED : "+ Result.getName());
//        shot= new Shot(Initialization.driver);
//        shot.snapError();
    }

    @Override
    public void onTestSkipped(ITestResult Result)
    {
    }

    @Override
    public void onTestStart(ITestResult Result)
    {
    }

    @Override
    public void onTestSuccess(ITestResult Result)
    {

        System.out.println("PASSED : "+Result.getName());
    }
}
