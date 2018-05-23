public class Concrete implements Material
{
    @Override
    public int getPrice(int length)
    {
        return length * 5;
    }
}
