import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class CustomCollectionTest extends TestCase
{
    private CustomCollection<Float> cc;

    @org.junit.Before
    public void setUp()
    {
        cc = new CustomCollection<>();
    }

    @org.junit.Test
    public void testAdd()
    {
        Assert.assertTrue(cc.add(4.f));
        Assert.assertTrue(cc.add(3.01f));
        Assert.assertTrue(cc.add(4.f));
    }

    @org.junit.Test
    public void testSize()
    {
        Assert.assertEquals(0, cc.size());
        cc.add(4.f);
        cc.add(3.5f);
        Assert.assertEquals(2, cc.size());
    }

    @org.junit.Test
    public void testIterator()
    {
        ArrayList<Float> expected = new ArrayList<>();
        expected.add(4.321f);
        expected.add(3943.f);
        expected.add(432.f);
        int i = 0;
        for (Float cur : cc)
        {
            Assert.assertEquals(expected.get(i), cur);
            i++;
        }
    }
}