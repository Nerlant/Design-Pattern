public abstract class GamblingGame
{
    protected int input;

    protected abstract boolean validateInput();

    protected abstract int calculateResult();

    public void startGame(int input)
    {
        this.input = input;

        if (!validateInput())
            return;

        int result = calculateResult();
        System.out.println("Calculated result is " + result);

        String status = result == input ? "YOU WON!" : "You lost.";
        System.out.println(status);
    }
}
