package man;
import com.rd.person.Men;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSettersGettersOfMan {
    private Men men;
    //create a new man person
    @BeforeClass
    public void addNewMenObject(){
        men = new Men("Firstname", "Lastname", 45, "Partner", false);
    }
    //test firstname
    @Description("Test the firstname of the men")
    @Test
    public void testFirstname(){
        men.setFirstName("Peter");
        Assert.assertEquals(men.getFirstName(), "Peter", "The firstname is not the same");
    }
    //test lastname
    @Description("Test the lastname of the men")
    @Test
    public void testLastname(){
        men.setFirstName("Polishchuk");
        Assert.assertEquals(men.getFirstName(), "Polishchuk", "The lastname is not the same");
    }
    //test age
    @Description("Test the age of the men")
    @Test
    public void testAge(){
        men.setAge(87);
        Assert.assertEquals(men.getAge(), 87, "The age is not the same");
    }
    //test partner
    @Description("Test the partner of the men")
    @Test
    public void testPartner(){
        men.setPartner("Valentina Polishchuk");
        Assert.assertEquals(men.getPartner(), "Valentina Polishchuk", "The partner is not the same");
    }
    //test has children
    @Description("Test the children of the men")
    @Test
    public void testHasChildren(){
        men.setHasChild(true);
        Assert.assertTrue(men.isHasChild(), "Not the same result");
    }
    //test count of children
    @Description("Test the count of children of the men")
    @Test
    public void testChildrenCount(){
        men.setChildrenCount(5);
        Assert.assertEquals(men.getChildrenCount(), 5, "The count of children is not the same");
    }
}
