import com.sun.istack.internal.NotNull;

public class Recharger
{
    public static void main(String[] args)
    {
        AndroidRecharger iPhoneAdapter = new IPhoneAdapter();
        recharge(iPhoneAdapter);
    }

    private static void recharge(@NotNull AndroidRecharger device)
    {
        System.out.println("Recharging using " + device.getAdapter());
    }
}
