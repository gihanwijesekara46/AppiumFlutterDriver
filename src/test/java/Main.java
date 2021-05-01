import com.google.common.collect.Lists;
import org.testng.TestNG;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("D:\\flutterappium\\run-test.xml");//path to xml..
        testng.setTestSuites(suites);
        testng.run();
    }

}
