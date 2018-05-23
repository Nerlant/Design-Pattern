public class StateDrinkAlcoholic implements StateDrink
{
    @Override
    public void createDrink(String drinkName)
    {
        System.out.println("Creating alcoholic " + drinkName);
    }
}
