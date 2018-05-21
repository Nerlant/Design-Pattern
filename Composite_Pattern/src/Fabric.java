public class Fabric
{
    public static void main(String[] args)
    {
        SeparatePart screw = new SeparatePart(1);
        SeparatePart woodenBoard = new SeparatePart(100);
        CompositePart tableTop = new CompositePart(woodenBoard);
        tableTop.addComponent(screw);
        tableTop.addComponent(screw);
        tableTop.addComponent(screw);
        tableTop.addComponent(screw);

        SeparatePart tableLeg = new SeparatePart(20);

        CompositePart table = new CompositePart(tableTop);
        table.addComponent(tableLeg);
        table.addComponent(tableLeg);
        table.addComponent(tableLeg);
        table.addComponent(tableLeg);

        System.out.println("Weight of the table is " + table.getWeight());
    }
}
