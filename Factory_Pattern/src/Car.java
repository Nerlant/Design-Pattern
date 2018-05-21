public abstract class Car
{
    private Engine engine;

    public Car()
    {
        engine = setEngine();
    }

    abstract protected Engine setEngine();

    public Engine getEngine()
    {
        return engine;
    }
}
