package man;

import DataProviders.DataProviderChildrenCount;
import com.rd.person.Men;
import jdk.jfr.Description;
import listeners.TestListenerCourse;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Listeners(TestListenerCourse.class)
public class TestDoesManHaveManyChildren {
    private static final Logger log = LogManager.getLogger(TestDoesManHaveManyChildren.class);
    private Men man;
    private Men manAnother;
    //create a new man person
    @BeforeClass(groups = "TestChildren")
    public void addNewMenObject(){
        log.trace("The start of creating the first men object");
        man = new Men("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
        log.trace("The creating of first men object is finished");
        log.info("The first men object has been created successfully");
        log.trace("The start of creating the first men object");
        manAnother= new Men("Alex", "Kolomiets", 50, "Tatiana Vesela", true);
        log.trace("The creating of first men object is finished");
        log.info("The second men object has been created successfully");
    }
    //test many children
    @Description("The test with Allure creating. TestDoesHaveManyChildren")
    @Test(dataProvider = "toGetManyChildren", dataProviderClass = DataProviderChildrenCount.class, groups = "TestChildren")
    public void testDoesHaveManyChildren(int num){
        Reporter.log("[Reporter] Test testDoesHaveManyChildren is started");
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
