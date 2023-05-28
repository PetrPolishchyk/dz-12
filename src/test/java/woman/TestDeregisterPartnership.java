package woman;

import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDeregisterPartnership {
    private Women women;
    //create a new woman person
    @BeforeClass
    public void addNewWomenObject(){
        women = new Women("Firstname", "Lastname", 35, "Partner", false);
    }
    //test deregister partnership
    @Test
    public void testRegisterPartnership(){
        women.registerPartnership("Kotsybinska");
        women.deregisterPartnership(true);
        Assert.assertEquals(women.getLastName(), "Lastname", "The deregister partnership method works wrong");
    }
}
