import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.Solution;

public class TestPyramid {
    Solution sol;
    @BeforeTest
    public void initPyramid() {
        sol = new Solution();
    }
    @Test
    public void testCalcArea_30_35() {        
        double actual = sol.calcVolume(30, 35);
        double expected = 10500;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcArea_123_85() {
        double actual = sol.calcVolume(123, 85);
        double expected = 428655;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcArea_1_35() {
        double actual = sol.calcVolume(1, 35);
        double expected = 11.666666666666666;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCalcArea_0_35() {
        double actual = sol.calcVolume(0, 55);
        double expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
