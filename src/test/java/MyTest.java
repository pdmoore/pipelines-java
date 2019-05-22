import com.microsoft.demo.Demo;
import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        String actual = d.DoSomething(true);
        Assert.assertEquals("I am covered", actual);
    }

    @Test
    public void test_method_2() {
        Demo d = new Demo();
        String actual = d.DoSomething(false);
        Assert.assertEquals("I am not covered", actual);
    }
}