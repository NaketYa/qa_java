import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testThrowsException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("БоевойТрансформер", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedCount = 0;
        int actualCount = lion.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = Arrays.asList();
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}