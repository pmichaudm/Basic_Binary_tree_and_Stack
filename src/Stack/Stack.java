// Philippe Michaud Mathias
// Student ID: 261124425

package Stack;

public class Stack {

    private final MyLinkedList list;

    public Stack() {
        list = new MyLinkedList();
    }

    public void addition() {
        if (list.getHead() == null) {
            System.out.println("List is empty");
        } else {
            Node result = new Node(list.getHead().getElement() + list.getHead().getNext().getElement());
            list.pop();
            list.pop();
            list.setHead(result);
            list.decrementSize();
        }
    }

    public void multiplication() {
        if (list.getHead() == null) {
            System.out.println("List is empty");
        } else {
            Node result = new Node(list.getHead().getElement() * list.getHead().getNext().getElement());
            list.pop();
            list.pop();
            list.setHead(result);
            list.decrementSize();
        }
    }

    public MyLinkedList getList() {
        return list;
    }

}
