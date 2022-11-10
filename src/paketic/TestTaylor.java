package paketic;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestTaylor  {
    Taylor taylor1=new Taylor();

     @Test
    public  void test2() throws Exception{

         assertEquals("0,84935678", taylor1.counter(1000,8) );
    }
    @Test
    public  void test3() throws Exception{
        Assert.assertEquals("0,776699", taylor1.counter(1.2, 6));
    }
    @Test
    public  void test4() throws Exception{
        Assert.assertEquals("-0,088029597", taylor1.counter(-100, 9));
    }
    @Test
    public  void test5() throws Exception{
        Assert.assertEquals("-0,088528037", taylor1.counter(10000, 9));
    }



        }
