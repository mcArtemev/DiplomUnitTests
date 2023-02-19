package ingredientUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)
public class getPriceUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    //Test data
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 12.3f);

    @Test
    public void getIngredientPriceShouldReturnFloat12point3(){
        float result = ingredient.getPrice();
        Assert.assertTrue("Название ингредиента не соответствует ожиданию \"12.3\". По факту: " + result, result==12.3f);
    }
}
