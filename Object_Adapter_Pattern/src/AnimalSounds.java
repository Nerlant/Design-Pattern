public class AnimalSounds
{
    public static void main(String[] args)
    {
        Duck blackDuck = new BlackDuck();
        makeDuckSounds(blackDuck);

        Turkey turkey = new Turkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        makeDuckSounds(turkeyAdapter);
    }

    private static void makeDuckSounds(Duck d)
    {
        d.quack();
    }
}
