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
public class getTypeUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    //Test data
    Ingredient ingredientSauce = new Ingredient(IngredientType.SAUCE, "Ketchup", 12.3f);
    Ingredient ingredientFilling = new Ingredient(IngredientType.FILLING, "Sausage", 12.3f);

    @Test
    public void getIngredientTypeShouldReturnSauce(){
        IngredientType result = ingredientSauce.getType();
        Assert.assertTrue("Тип ингредиента не соответствует ожиданию \"SAUCE\". По факту: " + result, result.equals(IngredientType.SAUCE));
    }
    @Test
    public void getIngredientTypeShouldReturnFilling(){
        IngredientType result = ingredientFilling.getType();
        Assert.assertTrue("Тип ингредиента не соответствует ожиданию \"FILLING\". По факту: " + result, result.equals(IngredientType.FILLING));
    }
}
