public abstract class IceCreamDecorator implements IceCream
{
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream iceCream)
    {
        this.decoratedIceCream = iceCream;
    }

    @Override
    public float getCost()
    {
        return decoratedIceCream.getCost();
    }

    @Override
    public String getIngredients()
    {
        return decoratedIceCream.getIngredients();
    }
}
