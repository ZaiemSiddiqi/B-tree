package com.wcupa.database;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BTree<Integer> bt = new BTree<>(5);
        bt.add(67);
        bt.add(77);
        bt.add(87);
        bt.add(97);
        System.out.println(bt.getRoot());
        bt.printLeaf();
    }
}


