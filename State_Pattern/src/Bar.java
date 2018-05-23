public class Bar
{
    public static void main(String[] args)
    {
        Drink drink = new Drink();

        drink.createDrink("Ipanema");

        drink.setState(new StateDrinkAlcoholic());
        drink.createDrink("Martini");

        drink.setState(new StateDrinkNonAlcoholic());
        drink.createDrink("Mojito");
    }
}
