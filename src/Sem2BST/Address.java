/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem2BST;

/**
 *
 * @author Ejer
 */
class Address {

    @Override
    public String toString() {
        return "Address{" + "street=" + street + '}';
    }
  String street;
  Address(String st){
    street = st;
  }
}