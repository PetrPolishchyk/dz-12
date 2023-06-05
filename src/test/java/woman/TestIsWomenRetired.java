package woman;

import DataProviders.DataProviderMen;
import DataProviders.DataProviderWomen;
import com.rd.person.Men;
import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIsWomenRetired {
    private Women women;
    private Women womenAnother;
    //test retired
    @Test(dataProvider = "womenAfterRetired", dataProviderClass = DataProviderWomen.class, groups = {"TestIsRetired"})
    public void testIsRetired(String firstName, String lastName, int age, String partner, boolean hasChild){
        women = new Women(firstName, lastName, age, partner, hasChild);
        Assert.assertTrue(women.isRetired(), "Wrong result of retiring check");
    }
    //test not retired
    @Test(dataProvider = "womenBeforeRetired", dataProviderClass = DataProviderWomen.class, groups = {"TestIsNotRetired"})
    public void testIsNotRetired(String firstName, String lastName, int age, String partner, boolean hasChild){
        womenAnother = new Women(firstName, lastName, age, partner, hasChild);
        Assert.assertFalse(womenAnother.isRetired(), "Wrong result of retiring check");
    }
}
