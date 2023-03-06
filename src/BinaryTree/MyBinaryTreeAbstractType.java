// Philippe Michaud Mathias
// Student ID: 261124425

package BinaryTree;

/**
 * This class is a binary tree abstract type.
 * I had to rewrite this entire part of the assignment because I felt like it was not done correctly.
 * The instructions were kind of confusing.
 * I first had a Worker AND and Node class. But that made things quite difficult for no reason.
 * Also tried to do Worker as a static class using Singleton design pattern until I saw the announcement on MyCourses.
 * I then decided to use a Worker class and a MyBinaryTreeAbstractType class.
 * Turns out it was much easier to do it this way. Don't know if it's the best way to do it though.
 */
public class MyBinaryTreeAbstractType {
    /* Declaring the attributes of the class.
    *  Worker root is the root of the tree.
    * int size is the size of the tree.
    */
    static Worker root;
    static int size;

    /**
     * This is the constructor of the class.
     * It only has a root which is null.
     */
    public MyBinaryTreeAbstractType() {
        this.root = null;
    }

    /**
     * This method returns the root of the tree.
     * @return root of the tree.
     */
    public static Worker root() {
        return root;
    }

    /**
     * This method returns the parent of the worker.
     * @param p is the worker.
     * @return parent of the worker.
     */
    public Worker parent(Worker p) {
        return p.getParent();
    }

    /**
     * This method returns the left child of the worker.
     * @param p is the worker.
     * @return left child of the worker.
     */
    public Worker left(Worker p) {
        return p.getLeft();
    }

    /**
     * This method returns the right child of the worker.
     * @param p is the worker.
     * @return right child of the worker.
     */
    public Worker right(Worker p) {
        return p.getRight();
    }

    /**
     * This method sets the left child of the worker.
     * @param p is the worker.
     * @param left is the left child to be added.
     */
    public void setLeft(Worker p, Worker left) {
        p.setLeft(left);
    }

    /**
     * This method sets the right child of the worker.
     * @param p is the worker.
     * @param right is the right child to be added.
     */
    public void setRight(Worker p, Worker right) {
        p.setRight(right);
    }

    /**
     * This method returns the size of the tree.
     * This is the first iteration of the method.
     * It recursively calls the overloaded method that travels through the tree.
     */
    public int size() {
        return size(root);
    }

    /**
     * This method returns the size of the tree.
     * This is the second iteration of the method.
     * It recursively calls itself until it reaches the end of the tree.
     * @param p is the worker.
     * @return size of the tree.
     */
    public int size(Worker p) {
        if (p == null) {
            return 0;
        }
        return 1 + size(p.getLeft()) + size(p.getRight());
    }

    /**
     * This method prints the tree in pre-order.
     * @param p is the worker.
     */
    public void preOrder(Worker p) {
        if (p == null) {
            return;
        }
        System.out.println(p);
        preOrder(p.getLeft());
        preOrder(p.getRight());
    }

    /**
     * This method prints the tree in pre-order.
     * It calls the overloaded method with the root as parameter.
     * It is the first iteration of the method.
     */
    public void preOrder() {
        System.out.println("Pre order:");
        preOrder(root);
    }


    public void inOrder(Worker p) {
        if (p == null) {
            return;
        }
        inOrder(p.getLeft());
        System.out.println(p);
        inOrder(p.getRight());
    }

    /**
     * This method prints the tree in pre-order.
     * It calls the overloaded method with the root as parameter.
     * It is the first iteration of the method.
     */
    public void inOrder() {
        System.out.println("In order:");
        inOrder(root);
    }
}
