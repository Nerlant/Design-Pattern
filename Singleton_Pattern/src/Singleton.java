public class Singleton // This pattern is so simple, no example needed
{
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static  Singleton getInstance()
    {
        return instance;
    }
}
