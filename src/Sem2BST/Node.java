/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem2BST;

/**
 *
 * @author Benedikte
 */
class Node {

   
    String key;
    Address value;
    Node left;
    Node right;



    Node( String key, Address value ) {
      this.key = key;
      this.value = value;
    }
}