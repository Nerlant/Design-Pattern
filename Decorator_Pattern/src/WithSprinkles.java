public class WithSprinkles extends IceCreamDecorator
{
    public WithSprinkles(IceCream iceCream)
    {
        super(iceCream);
    }

    @Override
    public float getCost()
    {
        return super.getCost() + 0.2f;
    }

    @Override
    public String getIngredients()
    {
        return super.getIngredients() + ", Sprinkles";
    }
}
