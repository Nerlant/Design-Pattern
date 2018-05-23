public class Walkway
{
    private int length;
    private Material material;

    public Walkway(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void setMaterial(Material mat)
    {
        material = mat;
    }

    public int getBuldingCosts()
    {
        return material.getPrice(length);
    }
}
