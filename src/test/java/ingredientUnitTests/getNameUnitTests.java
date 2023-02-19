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
public class getNameUnitTests {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    //Test data
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Ketchup", 12.3f);

    @Test
    public void getIngredientNameShouldReturnTomato(){
        String result = ingredient.getName();
        Assert.assertTrue("Название ингредиента не соответствует ожиданию \"Ketchup\". По факту: " + result, result.equals("Ketchup"));
    }
}