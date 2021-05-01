import Util.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import appium_flutter_driver.FlutterFinder;
import appium_flutter_driver.finder.FlutterElement;
import org.testng.annotations.Test;


public class AppiumTestDemo extends TestBase {

   @Test
    public void test1 (){

        try {
            switchContext("FLUTTER");
            logger = extent.startTest("FLUTTER Switch Context");
            logger.log(LogStatus.PASS, "FLUTTER Switch Context passed");
           // switchContext("NATIVE_APP");
            FlutterFinder find = new FlutterFinder(driver);
            Thread.sleep(3000);

            FlutterElement txt_username = find.byValueKey("txt_username");
            FlutterElement txt_password = find.byValueKey("txt_password");
            FlutterElement button_login = find.byValueKey("button_login");


            txt_username.sendKeys("user@yopmailcom");
            txt_password.sendKeys("123456");
            button_login.click();
            logger = extent.startTest("Flutter data input & Click test");
            logger.log(LogStatus.PASS, "Flutter data input & Click test passed");
            Thread.sleep(5000);

        } catch (TimeoutException | InterruptedException e) {
            logger = extent.startTest("Flutter data input & Click test Failed ");
            logger.log(LogStatus.FAIL, e);
        }

    }

}
