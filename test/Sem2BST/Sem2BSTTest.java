package Sem2BST;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benedikte
 */
public class Sem2BSTTest {

    public Sem2BSTTest() {
    }

 

    @Test
    public void testContainsKeyEmpty() {

        System.out.println("containsKey");
        String key = "";
        Sem2BST instance = new Sem2BST();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testContainsKeyFalse() {
        System.out.println("containsKey");
        String key = "Blop";
        Sem2BST instance = new Sem2BST();
        boolean expResult = false;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testContainsKeyTrue() {
        Sem2BST instance = new Sem2BST();
        instance.put("PrøveKnud", (new Address("Vejenvejen")));
        System.out.println("containsKey");
        String key = "PrøveKnud";
        boolean expResult = true;
        boolean result = instance.containsKey(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testPutGet() {
        System.out.println("put");
        String key = "Åse";
        Address value = new Address("Åsevej 18");
        Sem2BST instance2 = new Sem2BST();
        instance2.put(key, value);
        String expResult = "Åsevej 18";
        String result = instance2.get(key);
        assertEquals(expResult, result);

    }

    @Test
    public void testgetNull() {
        System.out.println("put");
        String key = "";
        Sem2BST instance2 = new Sem2BST();
        assertEquals(null, instance2.get(key));

    }
    
    
    @Test
    public void testFindNull() {
        System.out.println("find nothing");

        String key = "";
        Sem2BST instance = new Sem2BST();
        String expResult = null;
        String result = instance.find(key);
        assertEquals(expResult, result);

    }

    @Test
    public void testFind() {
        System.out.println("find");
        Sem2BST instance = new Sem2BST();
        instance.put("Hans", new Address("Pilealle 12"));
        instance.put("Asker", new Address("Lyngtoften 24"));
        instance.put("Johanne", new Address("Lars Bjørnsstræde 7a"));
        instance.put("Niels", new Address("Pillealle 12"));
        String key = "Asker";
        String expResult = "Lyngtoften 24";
        String result = instance.find(key);
        assertEquals(expResult, result);

    }

    @Test
    public void testSize() {
        System.out.println("size");
        Sem2BST instance = new Sem2BST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);

    }

    @Test
    public void testSizeOne() {
        System.out.println("size");
        Sem2BST instance = new Sem2BST();
        instance.put("Hans", new Address("Pilealle 12"));
        int expResult2 = 1;
        int result2 = instance.size();
        assertEquals(expResult2, result2);

    }

    @Test
    public void testSizeFour() {
        System.out.println("size");
        Sem2BST instance = new Sem2BST();
        instance.put("Hans", new Address("Pilealle 12"));
        instance.put("Asker", new Address("Lyngtoften 24"));
        instance.put("Johanne", new Address("Lars Bjørnsstræde 7a"));
        instance.put("Niels", new Address("Pillealle 12"));
        int expResult2 = 4;
        int result2 = instance.size();
        assertEquals(expResult2, result2);

    }

    @Test
    public void testValuesEmpty() {
        System.out.println("testValuesEmpty");
        Sem2BST instance = new Sem2BST();
        List<String> expResult = null;
        List<String> result = instance.values();
        assertEquals(expResult, result);
    }
// det er nok ikke særlig smart at gøre som jeg har gjort i values og keys

    @Test
    public void testValuesTwoElements() {
        System.out.println("testValuesTwoElements");
        Sem2BST instance = new Sem2BST();
        instance.put("Asker", new Address("Lyngtoften 24"));
        instance.put("Johanne", new Address("Lars Bjørnsstræde 7a"));
        int expResult = 2;
        List<String> result = instance.values();
        assertEquals(expResult, result.size());
    }


    @Test
    public void testKeys() {
        System.out.println("keys null");
        Sem2BST instance = new Sem2BST();
        assertNull(instance.keys());

        System.out.println("keys");
        instance.put("Asker", new Address("Lyngtoften 24"));
        instance.put("Johanne", new Address("Lars Bjørnsstræde 7a"));
        instance.put("Niels", new Address("Pillealle 12"));

        assertEquals("Asker", instance.keys().get(0));
        assertEquals("Johanne", instance.keys().get(1));
        assertEquals("Niels", instance.keys().get(2));
        assertNotNull(instance.keys());
        assertFalse(instance.keys().isEmpty());
    }

}
