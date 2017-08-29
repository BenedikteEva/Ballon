package Sem2BST;

import java.io.PrintStream;

/**
 *
 * @author Benedikte
 */
public class Main {

    public static void main(String[] args) {
        Sem2BST dict = new Sem2BST();
        dict.put("Hans", new Address("Pilealle 12"));
        dict.put("Asker", new Address("Lyngtoften 24"));
        dict.put("Johanne", new Address("Lars Bjørnsstræde 7a"));
        dict.put("Niels", new Address("Pillealle 12"));
        dict.put("Niel", new Address("Pilealle 16"));
        dict.put("Johannes", new Address("Lars Bjørnsstræde 7b"));
dict.put("Gertrud", new Address("Lyngtoften 28"));
        dict.get("Asker");
        System.out.println(dict.get("Asker"));
        System.out.println(dict.keys2());
   
    }
}
