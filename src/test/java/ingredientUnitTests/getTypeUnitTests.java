package ingredientUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class getTypeUnitTests {

    private Ingredient ingredientSauce;
    private Ingredient ingredientFilling;

    @Before
    public void setUp() {
        ingredientSauce = new Ingredient(IngredientType.SAUCE, "Ketchup", 1.5f);
        ingredientFilling = new Ingredient(IngredientType.FILLING, "Sausage", 2.5f);    }

    @Test
    public void getIngredientTypeShouldReturnSauce() {
        IngredientType expectedType = IngredientType.SAUCE;
        IngredientType actualType = ingredientSauce.getType();
        assertEquals(expectedType, actualType);
    }
    @Test
    public void getIngredientTypeShouldReturnFilling(){
        IngredientType expectedType = IngredientType.FILLING;
        IngredientType actualType = ingredientFilling.getType();
        assertEquals(expectedType, actualType);
    }
}
