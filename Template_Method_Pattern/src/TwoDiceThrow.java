import java.util.concurrent.ThreadLocalRandom;

public class TwoDiceThrow extends GamblingGame
{
    private int getDiceThrow()
    {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }

    @Override
    protected boolean validateInput()
    {
        if (input < 2 || input > 12)
        {
            System.out.println("The input for two dice throw has to be between 2 and 12.");
            return false;
        }
        return true;
    }

    @Override
    protected int calculateResult()
    {
        return getDiceThrow() + getDiceThrow();
    }
}
