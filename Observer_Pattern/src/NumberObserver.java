public class NumberObserver implements Observer
{
    @Override
    public void update(Subject s)
    {
        System.out.println("Observer was called with new state of " + s.getState());
    }
}
