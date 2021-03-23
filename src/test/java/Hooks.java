import org.junit.After;
import org.junit.Before;
import utils.CommonFunctions;

public class Hooks extends CommonFunctions {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest()
    {
        commonFunctions.openBrowser();
    }


    @After
    public void closeBrowser()
    {
        commonFunctions.closeBrowser();
    }

}
