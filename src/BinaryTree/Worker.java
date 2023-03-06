// Philippe Michaud Mathias
// Student ID: 261124425

package BinaryTree;

/**
 * This class represents a worker in a company.
 * Each worker has a name and a salary.
 * Each worker has a left and right child.
 * Each worker has a parent.
 */
public class Worker {
    // Declaring the attributes of the class.
    private String name;
    private int salary;
    private Worker left;
    private Worker right;
    private Worker parent;

    /**
     * This is the constructor of the class.
     * It only has a name and a salary.
     * @param name
     * @param salary
     */
    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * This method returns the name of the worker.
     * @return name of the worker.
     */
    public String getName() {
        return name;
    }

    /*
     * This method sets the name of the worker.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the salary of the worker.
     * @return salary of the worker.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * This method sets the salary of the worker.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * This method returns the left child of the worker.
     * @return left child of the worker.
     */
    public Worker getLeft() {
        return left;
    }

    /**
     * This method sets the left child of the worker.
     * @param left child of the worker.
     */
    public void setLeft(Worker left) {
        this.left = left;
        this.left.setParent(this);
    }

    /**
     * This method returns the right child of the worker.
     * @return right child of the worker.
     */
    public Worker getRight() {
        return right;
    }

    /**
     * This method sets the right child of the worker.
     * @param right child of the worker.
     */
    public void setRight(Worker right) {
        this.right = right;
        this.right.setParent(this);
    }

    /**
     * This method returns the parent of the worker.
     * @return parent of the worker.
     */
    public Worker getParent() {
        return parent;
    }

    /**
     * This method sets the parent of the worker.
     * @param parent of the worker.
     */
    public void setParent(Worker parent) {
        this.parent = parent;
    }

    /**
     * This toString method returns the name and the salary of the worker.
     * @return name and salary of the worker.
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Salary: " + this.salary;
    }
}
