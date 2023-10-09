package Test;
import org.testng.annotations.DataProvider;
public class DataDrivenTest {
    @DataProvider(name = "AccountDataTest")
    public static Object[][] AccountDataTest() {
        return new Object[][] {
                {"John","Doe","johndoe11@example.com","StrongPwd123!!","StrongPwd123!"},// valid
                {"  ","Doe","johndoe@example.com","StrongPwd123!","StrongPwd123!"}, //empty name
                {"John","Doe","johndoe@example.com","123","123"},                  //week pass
                {"John","Doe","johndoe@example.com","123","StrongPwd123!"},         //pass not mach
                {"John","Doe","johndoe","StrongPwd123!","StrongPwd123!"},           //invalid email
                {"John Done Zeyad Ahmed mahmoed Mohmoud","Doe","johndoe","StrongPwd123!","StrongPwd123!"},      //invalid email
        };
    }
    @DataProvider(name = "SignINDataTest")
    public static Object[][] SignInDataTest() {
        return new Object[][] {
                {"johndoe@example.com","StrongPwd123!"},// valid
                {"johndoe@example.com",""},
                {"johndoe@example.com","StrongPwd"},
                {"johndoe","StrongPwd123!"},

        };
    }
}
