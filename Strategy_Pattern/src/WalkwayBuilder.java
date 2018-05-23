public class WalkwayBuilder
{
    public static void main(String[] args)
    {
        Walkway gravelWalkway = new Walkway(20);
        Walkway concreteWalkway = new Walkway(20);

        gravelWalkway.setMaterial(new Gravel());
        concreteWalkway.setMaterial(new Concrete());

        System.out.println("The gravel walkway costs " + gravelWalkway.getBuldingCosts());
        System.out.println("The concrete walkway costs " + concreteWalkway.getBuldingCosts());
    }
}
