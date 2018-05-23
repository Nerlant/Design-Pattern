public class Numbers
{
    public static void main(String[] args)
    {
        NumberEvent numberEvent = new NumberEvent();

        NumberObserver observer = new NumberObserver();

        numberEvent.attach(observer);
        numberEvent.setState(42);
    }
}
