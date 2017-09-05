package factories;

import ingredients.breads.Bread;
import ingredients.cheese.Cheese;
import ingredients.condiments.Condiment;
import ingredients.extras.Extra;
import ingredients.meats.Meat;
import ingredients.toppings.Toppings;

import java.util.List;

public interface BurgerIngredientFactory {
    Bread createBread();
    Cheese createCheese();
    Meat createMeat();
    List<Condiment> createCondiments();
    List<Extra> createExtras();
    List<Toppings> createVeggies();
}
