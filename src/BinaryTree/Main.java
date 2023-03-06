// Philippe Michaud Mathias
// Student ID: 261124425

package BinaryTree;

/**
 * This is the main class
 * It creates a tree and adds workers to it.
 * It is used to test the other classes and methods.
 */
public class Main {
    public static void main(String[] args) {
        MyBinaryTreeAbstractType tree = new MyBinaryTreeAbstractType();
        Worker CEO = new Worker("CEO", 100000);
        Worker CTO = new Worker("CTO", 120000);
        Worker HR = new Worker("HR", 77000);
        Worker RD = new Worker("RD", 140000);
        Worker Eng = new Worker("Eng", 110000);
        Worker Relation = new Worker("Relation", 22000);
        Worker Hiring = new Worker("Hiring", 20000);
        tree.root = CEO;
        tree.setLeft(CEO, CTO);
        CTO.setLeft(RD);
        CTO.setRight(Eng);
        CEO.setRight(HR);
        HR.setLeft(Relation);
        HR.setRight(Hiring);
        System.out.println(CEO.getLeft());
        System.out.println(CEO.getRight());
        System.out.println(tree.root());
        System.out.println(Hiring.getParent());
        System.out.println(tree.size());
        tree.preOrder();
        tree.inOrder();
    }

}
