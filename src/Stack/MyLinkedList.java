// Philippe Michaud Mathias
// Student ID: 261124425

package Stack;

public class MyLinkedList {
    private Node head;
    private int size = 0;

    /**
     * This constructor adds a node to the front of the list.
     */
    public MyLinkedList() {
        head = null;
    }

    /**
     * This method adds a node to the front of the list.
     */
    public void pop() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            head = head.getNext();
            decrementSize();
        }
    }

    /**
     * This method adds a node to the top of the stack.
     * @param element the value to add to the node.
     */
    public void push (int element) {
        Node node = new Node(element); // Creating a new node with the value passed in.
        if (head != null) { // If the head is not null, then the node is added to the front of the list.
            node.setNext(head);
        }
        head = node;  // set the head to the new node.
        incrementSize(); // Increment the size of the list.
    }

    /**
     * This method decrements the size of the list.
     */
    public void decrementSize() {
        size--;
    }

    /**
     * This method increments the size of the list.
     */
    public void incrementSize() {
        size++;
    }

    /**
     * This method returns the size of the list.
     * @return size
     */
    public int size() {
        return size;
    }

    /**
     * This method returns the head of the list.
     * @return head Head node of the list
     */
    public Node getHead() {
        return head;
    }

    /**
     * This method sets the head of the list.
     * @param head Takes a node as a parameter.
     */
    public void setHead(Node head) {
        head.setNext(this.head);
        this.head = head;
    }

    /**
     * This method is an override of the toString method.
     * It prints the list in the format of element-element-element.
     * @Override toString method
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            result.append(temp.getElement()).append("-");
            temp = temp.getNext();
        }
        return result.toString();
    }
}
