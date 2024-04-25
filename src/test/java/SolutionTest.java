import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String s = "acfgbd";
        int k = 2;
        int expected =4;
        int actual = new Solution().longestIdealString(s, k);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        String s = "pvjcci";
        int k = 4;
        int expected = 2;
        int actual = new Solution().longestIdealString(s, k);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test3(){
        String s = "azaza";
        int k = 25;
        int expected = 5;
        int actual = new Solution().longestIdealString(s, k);

        Assert.assertEquals(expected,actual);
    }
}
