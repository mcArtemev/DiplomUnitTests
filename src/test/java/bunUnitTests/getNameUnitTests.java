package bunUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

@RunWith(MockitoJUnitRunner.class)
public class getNameUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    //Test data
    Bun whiteBun = new Bun("White", 22.2f);

    @Test
    public void getBunNameShouldReturnWhite(){
        String result = whiteBun.getName();
        Assert.assertTrue("Название булочки не соответствует ожиданию: \"White\". По факту: " + result, result.equals("White"));
    }
}
