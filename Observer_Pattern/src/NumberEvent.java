public class NumberEvent extends Subject
{
    private Integer state;

    @Override
    public Integer getState()
    {
        return state;
    }

    @Override
    void setState(Object o)
    {
        state = (Integer)o; // Is there a better way to do this?
        this.notifyObservers();
    }
}
