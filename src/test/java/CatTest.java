import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actualFood = cat.getFood();
        List<String> expectedFood = feline.eatMeat();
        Assert.assertEquals(actualFood, expectedFood);
    }

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        Assert.assertEquals(expectedSound, actualSound);
    }
}