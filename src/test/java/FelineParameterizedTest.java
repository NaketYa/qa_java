import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int expectedCount;
    public FelineParameterizedTest(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1},
                {2},
                {0},
                {-1},
        };
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens(expectedCount);
        Assert.assertEquals(expectedCount, actualCount);
    }
}