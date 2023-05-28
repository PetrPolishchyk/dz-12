package woman;

import com.rd.person.Women;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRegisterPartnership {
    private Women women;
    //create a new woman person
    @BeforeClass
    public void addNewWomenObject(){
        women = new Women("Firstname", "Lastname", 45, "Partner", false);
    }
    //test register partnership
    @Test
    public void testRegisterPartnership(){
        women.registerPartnership("Kotsybinska");
        Assert.assertEquals(women.getLastName(), "Kotsybinska", "The register partnership method works wrong");
    }
}
