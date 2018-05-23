import java.util.Scanner;

public class Gambling
{
    public static void main(String[] args)
    {
        GamblingGame lottery = new Lottery();
        GamblingGame twoDiceThrow = new TwoDiceThrow();

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter prediction for lottery (between 100000 and 999999):");
        int lotteryInput = reader.nextInt();
        lottery.startGame(lotteryInput);

        System.out.println("Enter prediction for two dice game (between 2 and 12):");
        int twoDiceThrowInput = reader.nextInt();
        twoDiceThrow.startGame(twoDiceThrowInput);

        reader.close();
    }
}
