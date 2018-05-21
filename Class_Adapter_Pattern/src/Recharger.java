public class Recharger
{
    public static void main(String[] args)
    {
        AndroidRecharger iPhoneAdapter = new IPhoneAdapter();
        recharge(iPhoneAdapter);
    }

    private static void recharge(AndroidRecharger recharger)
    {
        System.out.println("Recharging using " + recharger.getAdapter());
    }
}
