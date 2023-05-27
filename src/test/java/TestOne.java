import org.testng.annotations.BeforeMethod;
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
}
