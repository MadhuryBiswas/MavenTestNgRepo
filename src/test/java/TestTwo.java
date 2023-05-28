import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTwo {
    @Test(dataProvider = "Provider",dataProviderClass = DataProviderHelper.class)
    public void test4(int ssn,String name,int phone){
        System.out.println("SSN is "+ssn);
        System.out.println("Name is "+name);
        System.out.println("Phone is:"+phone);
    }
    @Test
    public void test5(){
        System.out.println("Test Five");
    }
    @DataProvider(name="Provider")
    public Object[][]dataProvider(){
        Object[][]newdata=new Object[3][3];
        newdata[0][0]=123;
        newdata[0][1]="Madhury";
        newdata[0][2]=1236765;
        newdata[1][0]=12345;
        newdata[1][1]=878623;
        newdata[1][2]="Boat";
        newdata[2][0]=523;
        newdata[2][1]="Air";
        newdata[2][2]=98763;
        return newdata;

    }


}
