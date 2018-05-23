public class Gravel implements Material
{
    @Override
    public int getPrice(int length)
    {
        return length * 2;
    }
}
