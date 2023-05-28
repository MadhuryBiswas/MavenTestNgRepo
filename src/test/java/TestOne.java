import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {
    @BeforeMethod
    public void beformethod(){
        System.out.println("Before Method");
    }
    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }
    @DataProvider(name="Provider")
    public Object[][] dataProvider(){
        data[0][0]=123;
        data[0][1]="Kasif";
        data[1][0]=236;
        data[1][1]="Asma";
        return new
    }
}
