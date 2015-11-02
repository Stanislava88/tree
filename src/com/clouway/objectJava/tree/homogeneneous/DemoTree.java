package com.clouway.objectJava.tree.homogeneneous;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoTree {
  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.add(50);
    tree.add(12);
    tree.add(16);
    tree.add(60);
    tree.add(6);
    tree.add(9);
    tree.add(66);
    System.out.println(tree.add(12));
    System.out.println("The tree in inOrder:");
    tree.inorder();
    System.out.println("The search value is:" + tree.search(22));


  }
}
