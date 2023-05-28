package woman;

import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSetterGetterOfWoman {
    private Women women;
    //create a new woman person
    @BeforeClass
    public void addNewWomenObject(){
        women = new Women("Firstname", "Lastname", 45, "Partner", false);
    }
    //test firstname
    @Test
    public void testFirstname(){
        women.setFirstName("Olena");
        Assert.assertEquals(women.getFirstName(), "Olena", "The firstname is not the same");
    }
    //test lastname
    @Test
    public void testLastname(){
        women.setFirstName("Kozak");
        Assert.assertEquals(women.getFirstName(), "Kozak", "The lastname is not the same");
    }
    //test age
    @Test
    public void testAge(){
        women.setAge(35);
        Assert.assertEquals(women.getAge(), 35, "The age is not the same");
    }
    //test partner
    @Test
    public void testPartner(){
        women.setPartner("Valentin Podolyak");
        Assert.assertEquals(women.getPartner(), "Valentin Podolyak", "The partner is not the same");
    }
    //test has children
    @Test
    public void testHasChildren(){
        women.setHasChild(true);
        Assert.assertTrue(women.isHasChild(), "Not the same result");
    }
    //test count of children
    @Test
    public void testChildrenCount(){
        women.setChildrenCount(2);
        Assert.assertEquals(women.getChildrenCount(), 2, "The count of children is not the same");
    }
}
