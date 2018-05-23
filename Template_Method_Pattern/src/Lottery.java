import java.util.concurrent.ThreadLocalRandom;

public class Lottery extends GamblingGame
{
    @Override
    protected boolean validateInput()
    {
        if (input < 100000 || input > 999999)
        {
            System.out.println("For lottery the input has to be between 100000 and 999999.");
            return false;
        }

        return true;
    }

    @Override
    protected int calculateResult()
    {
        return ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
    }
}
