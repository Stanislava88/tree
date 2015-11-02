package com.clouway.objectJava.tree.heterogeneous;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoTree {
  public static void main(String[] args) {
    Tree tree = new Tree();
    Cat myCat = new Cat("Sisi");
    Dog myDog = new Dog("Lassie", 2);
    Person person = new Person("Maria");
    Double double1 = new Double(2.8);
    Integer integer=new Integer(5);
    tree.add(16, myCat.getName());
    tree.add(16, myCat.getName());
    tree.add(20, myDog.getName() + myDog.getAge());
    tree.add(10, myCat.getName());
    tree.add(40, double1.doubleValue());
    tree.add(17, person.getName());
    tree.add(50,integer.intValue());
    tree.inOrder();
  }
}

