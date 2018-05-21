public class Audi extends Car
{

    @Override
    protected Engine setEngine()
    {
        return new V8Engine();
    }
}
