package DataProviders;

import org.testng.annotations.DataProvider;


public class DataProviderChildrenCount {

    @DataProvider(name = "toGetNotManyChildren")
    public Object[][] toGetNotManyChildren(){
        return new Object[][] {{0}, {1}, {2}};
    }

    @DataProvider(name = "toGetManyChildren")
    public Object[][] toGetManyChildren(){
        return new Object[][] {{3}, {4}, {5}};
    }

}
