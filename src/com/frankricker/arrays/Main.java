package com.frankricker.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Array array = new Array();
    array.SetUpList();
    array.ArrayPrinter();
    array.insertElement('C', 'B');
    array.ArrayPrinter();
    array.removeElement('c');
    array.ArrayPrinter();
    }
}
