public class VanillaIceCream implements IceCream
{
    @Override
    public float getCost()
    {
        return 1.f;
    }

    @Override
    public String getIngredients()
    {
        return "Vanilla ice cream";
    }
}
