package bunUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

@RunWith(MockitoJUnitRunner.class)
public class getPriceUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    //Test data
    Bun whiteBun = new Bun("White", 22.2f);

    @Test
    public void getBunPriceShouldReturnFloat22point2(){
        float result = whiteBun.getPrice();
        Assert.assertTrue("Название булочки не соответствует ожиданию: \"22.2\". По факту: " + result, result==22.2f);
    }
}
