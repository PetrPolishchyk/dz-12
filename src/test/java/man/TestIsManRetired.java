package man;

import DataProviders.DataProviderMen;
import com.rd.person.Men;
import com.rd.person.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIsManRetired {
    private Men man;
    private Men manAnother;
    //create a new man person
//    @BeforeClass
//    public void addNewMenObject(Person beforeRetired, Person afterRetired){
//        man = new Men("Alex", "Kolomiets", 68, "Tatiana Vesela", true);
//        manAnother = new Men("Alex", "Kolomiets", 35, "Tatiana Vesela", true);
//    }
    //test retired
    @Test(dataProvider = "menAfterRetired", dataProviderClass = DataProviderMen.class, groups = {"TestIsRetired"})
    public void testIsRetired(String firstName, String lastName, int age, String partner, boolean hasChild){
        man = new Men(firstName, lastName, age, partner, hasChild);
        Assert.assertTrue(man.isRetired(), "Wrong result of retiring check");
    }
    //test not retired
    @Test(dataProvider = "menBeforeRetired", dataProviderClass = DataProviderMen.class, groups = {"TestIsNotRetired"})
    public void testIsNotRetired(String firstName, String lastName, int age, String partner, boolean hasChild){
        manAnother = new Men(firstName, lastName, age, partner, hasChild);
        Assert.assertFalse(manAnother.isRetired(), "Wrong result of retiring check");
    }
}
