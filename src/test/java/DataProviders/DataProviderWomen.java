package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderWomen {
    @DataProvider(name = "womenBeforeRetired")
    public Object[][] womenBeforeRetired(){
        return new Object[][] {{"Oksana", "Vaks", 22, "Serhiy Ovodov", true},
                {"Oksana", "Vaks", 34, "Serhiy Ovodov", true},
                {"Oksana", "Vaks", 50, "Serhiy Ovodov", true}};
    }

    @DataProvider(name = "womenAfterRetired")
    public Object[][] womenAfterRetired(){
        return new Object[][] {{"Oksana", "Vaks", 62, "Serhiy Ovodov", true},
                {"Oksana", "Vaks", 72, "Serhiy Ovodov", true},
                {"Oksana", "Vaks", 80, "Serhiy Ovodov", true}};
    }
}
