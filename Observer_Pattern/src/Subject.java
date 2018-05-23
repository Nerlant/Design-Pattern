import java.util.HashSet;
import java.util.Set;

public abstract class Subject
{
    private Set<Observer> observers;

    Subject()
    {
        observers = new HashSet<>();
    }

    protected void notifyObservers()
    {
        for (Observer o : observers)
        {
            o.update(this);
        }
    }

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void detach(Observer observer)
    {
        observers.remove(observer);
    }

    abstract Object getState();

    abstract void setState(Object o);
}
