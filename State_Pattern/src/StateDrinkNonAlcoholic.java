public class StateDrinkNonAlcoholic implements StateDrink
{
    @Override
    public void createDrink(String drinkName)
    {
        System.out.println("Creating non-alcoholic " + drinkName);
    }
}
