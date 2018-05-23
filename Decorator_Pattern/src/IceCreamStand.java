public class IceCreamStand
{
    public static void main(String[] args)
    {
        IceCream iceCream = new VanillaIceCream();
        printIceCreamInfo(iceCream);

        iceCream = new ChocolateCoated(iceCream);
        printIceCreamInfo(iceCream);

        iceCream = new WithSprinkles(iceCream);
        printIceCreamInfo(iceCream);
    }

    private static void printIceCreamInfo(IceCream iceCream)
    {
        System.out.println("Costs: " + iceCream.getCost() + " Ingredients: " + iceCream.getIngredients());
    }
}
