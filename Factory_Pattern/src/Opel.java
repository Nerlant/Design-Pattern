public class Opel extends Car
{
    @Override
    protected Engine setEngine()
    {
        return new V4Engine();
    }
}
