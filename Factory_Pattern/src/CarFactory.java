public class CarFactory
{
    public static void main(String[] args)
    {
        Car opel = new Opel();
        Car audi = new Audi();

        System.out.println("Opel has a " + opel.getEngine());
        System.out.println("Audi has a " + audi.getEngine());
    }
}
