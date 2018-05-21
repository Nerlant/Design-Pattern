public class TurkeyAdapter implements Duck
{
    private Turkey turkey;

    public TurkeyAdapter(Turkey t)
    {
        turkey = t;
    }

    @Override
    public void quack()
    {
        turkey.gobble();
    }
}
