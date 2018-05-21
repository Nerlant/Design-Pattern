public abstract class Engine
{
    private String power;

    protected void setPower(String power)
    {
        this.power = power;
    }

    @Override
    public String toString()
    {
        return power;
    }
}
