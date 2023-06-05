package woman;

import DataProviders.DataProviderChildrenCount;
import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDoesWomenHavaManyChildren {
    private Women women;
    private Women womanAnother;
    //create a new woman person
    @BeforeClass(groups = "TestChildren")
    public void addNewWomanObject(){
        women = new Women("Oksana", "Vaks", 64, "Serhiy Ovodov", true);
        womanAnother= new Women("Viktoria", "Box", 30, "Oleh Robert", true);
    }
    //test many children
    @Test(dataProvider = "toGetManyChildren", dataProviderClass = DataProviderChildrenCount.class, groups = "TestChildren")
    public void testDoesHaveManyChildren(int num){
        women.setChildrenCount(num);
        Assert.assertTrue(women.doesHaveManyChildren(), "Wrong result of children counting check");
    }
    //test not many children
    @Test(dataProvider = "toGetNotManyChildren", dataProviderClass = DataProviderChildrenCount.class, groups = "TestChildren")
    public void testDoesNotHaveManyChildren(int num){
        womanAnother.setChildrenCount(num);
        Assert.assertFalse(womanAnother.doesHaveManyChildren(), "Wrong result of children counting check");
    }
}
