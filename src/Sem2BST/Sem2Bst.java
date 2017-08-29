package Sem2BST;

import java.util.ArrayList;
import java.util.Collections;
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
    private ArrayList<String> allKeys = new ArrayList<>();
    private ArrayList<String> all = new ArrayList<>();
    private ArrayList<Node> many = new ArrayList();

    public Sem2BST() {

    }

    public boolean containsKey(String key) {

        return find(key) != null;
    }

    public void put(String key, Address value) {

        size();

        if (root == null) {

            root = new Node(key, value);
            if (containsKey(key) == true) {
                allKeys.add(root.key);
                all.add(root.value.street);
            }
        } else {

            insert(key, value, root);
            if (containsKey(key) == true) {

                allKeys.add(node.key);
                all.add(node.value.street);
            }
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
                    many.add(node.left);

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
                    many.add(node.right);

                } else {

                    insert(key, value, node.right);

                }
                break;
        }

    }

    public Address get(String key) {

        return find(key);
    }

    public Address find(String key) {

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

                return node.value;
            }
            if (node == null) {
                return null;

            }

        }
        return null;
    }

    public List<String> keys() {
        if (s == 0) {
            return null;
        } else {

            Collections.sort(allKeys);
            for (int i = 0; i < allKeys.size(); i++) {
                return allKeys;
            }
        }
        return null;
    }

    public List<Node> keys2() {

        return many;

    }

    public List<Address> values2() {
        ArrayList<Address> all = new ArrayList();
        for (int i = 0; i < internal.length; i++) {
            if (internal[i] != null) {
                all.add(internal[i].value);
            }
        }
        return all;
    }

    public List<String> values() {

        if (s == 0) {
            return null;
        } else {

            for (int i = 0; i < all.size(); i++) {
                sortByKey();
                return all;
            }
        }
        return null;

    }

    public List<Node> sortByKey() {

        return null;

    }
}
