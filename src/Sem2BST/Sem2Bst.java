package Sem2BST;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benedikte
 */
class Sem2BST {

    private Node[] internal;
    String key;
    Address value;
    Node root;
    Node node = new Node(key, value);
    int s = 0;

    public boolean containsKey(String key) {

        return find(key) != null;
    }

    public void put(String key, Address value) {
        size();
        if (root == null) {
            root = new Node(key, value);
        } else {
            insert(key, value, root);
        }
    }

    public int size() {
        return s++;
    }

    private void insert(String key, Address value, Node node) {

        switch (Integer.signum(key.compareToIgnoreCase(node.key))) {
            case -1:
                if (node.left == null) {
                    node.left = new Node(key, value);
                } else {
                    insert(key, value, node.left);
                }
                break;
            case 0:
                node.value = value;
                break;
            case 1:
                if (node.right == null) {
                    node.right = new Node(key, value);
                } else {
                    insert(key, value, node.right);
                }
                break;
        }

    }

    public String get(String key) {
        return find(key);
    }

    public String find(String key) {
        node = root;
        while (node != null) {
            int findYourPlace = key.compareToIgnoreCase(node.key);
            if (findYourPlace < 0) {

                node = node.left;

            }
            if (findYourPlace > 0) {
                node = node.right;

            }
            if (findYourPlace == 0) {

                return node.value.street;
            }

        }
        return null;

    }

//    private int findIndex( String key ) {
//        int index = node.key.indexOf(key);
//        while ( internal[ index ] != null
//                && !internal[ index ].key.equals( key ) ) {
//            index = (node.key.indexOf(key));
//        }
//        return index;
//}
    public List<String> keys() {
        ArrayList<String> allKeys = new ArrayList();
     
       
            if (!node.key.isEmpty()) {
                
                allKeys.add(node.key);
                
                return allKeys;
                
            
        }
        return allKeys;

    }

    public List<Address> values() {
        ArrayList<Address> all = new ArrayList();
        for (int i = 0; i < internal.length; i++) {
            if (internal[i] != null) {
                all.add(internal[i].value);
            }
        }
        return all;
    }
}
