package DataProviders;

import com.rd.person.Person;
import org.testng.annotations.DataProvider;

public class DataProviderMen {
    @DataProvider(name = "menBeforeRetired")
    public Object[][] menBeforeRetired(){
        return new Object[][] {{"Alex", "Kolomiets", 35, "Tatiana Vesela", true},
                {"Alex", "Kolomiets", 45, "Tatiana Vesela", true},
                {"Alex", "Kolomiets", 55, "Tatiana Vesela", true}};
    }

    @DataProvider(name = "menAfterRetired")
    public Object[][] menAfterRetired(){
        return new Object[][] {{"Alex", "Kolomiets", 66, "Tatiana Vesela", true},
                {"Alex", "Kolomiets", 76, "Tatiana Vesela", true},
                {"Alex", "Kolomiets", 86, "Tatiana Vesela", true}};
    }
}
