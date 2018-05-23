public class Drink
{
    private StateDrink state;

    Drink()
    {
        state = new StateDrinkNonAlcoholic();
    }

    public void setState(StateDrink state)
    {
        this.state = state;
    }

    public void createDrink(String name)
    {
        state.createDrink(name);
    }
}
