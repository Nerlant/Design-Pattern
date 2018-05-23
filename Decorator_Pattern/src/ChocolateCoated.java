public class ChocolateCoated extends IceCreamDecorator
{
    public ChocolateCoated(IceCream iceCream)
    {
        super(iceCream);
    }

    @Override
    public float getCost()
    {
        return super.getCost() + 0.4f;
    }

    @Override
    public String getIngredients()
    {
        return super.getIngredients() + ", Chocolate Coat";
    }
}
