package man;

import DataProviders.DataProviderChildrenCount;
import com.rd.person.Men;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDoesManHaveManyChildren {
    private Men man;
    private Men manAnother;
    //create a new man person
    @BeforeClass(groups = "TestChildren")
    public void addNewMenObject(){
        man = new Men("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
        manAnother= new Men("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
    }
    //test many children
    @Test(dataProvider = "toGetManyChildren", dataProviderClass = DataProviderChildrenCount.class, groups = "TestChildren")
    public void testDoesHaveManyChildren(int num){
        man.setChildrenCount(num);
        Assert.assertTrue(man.doesHaveManyChildren(), "Wrong result of children counting check");
    }
    //test not many children
    @Test(dataProvider = "toGetNotManyChildren", dataProviderClass = DataProviderChildrenCount.class, groups = "TestChildren")
    public void testDoesNotHaveManyChildren(int num){
        manAnother.setChildrenCount(num);
        Assert.assertFalse(manAnother.doesHaveManyChildren(), "Wrong result of children counting check");
    }
}
