import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("web_testng.xml");
        suites.add("academy_testng.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}