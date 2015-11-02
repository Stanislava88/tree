package com.clouway.objectJava.tree.homogeneneous;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Tree {
  TreeNode root;

  public boolean add(int key) {
    if (root == null) {
      root = new TreeNode(key);
    }
    return addNode(root, key);
  }

  public void inorder() {
    inOrder(root);

  }

  public boolean search(int key) {
    TreeNode current = root;
    while (current.key != key) {
      if (key < current.key) {
        current = current.left;
      } else {
        current = current.right;
      }
      if (current == null) {
        return false;
      }
    }
    return true;
  }

  private void inOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      System.out.println(node.key);
      inOrder(node.right);
    }
  }

  private boolean addNode(TreeNode node, int key) {

    if (node.key > key) {
      if (node.left == null) {
        node.left = new TreeNode(key);
      } else if (node.left.key == key) {
        return false;
      } else {
        addNode(node.left, key);
      }
    }
    if (node.key < key) {
      if (node.right == null) {
        node.right = new TreeNode(key);
      } else if (node.right.key == key) {
        return false;
      } else {
        addNode(node.right, key);
      }
    }
    return true;
  }
}





