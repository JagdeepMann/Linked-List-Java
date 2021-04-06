public class SinglyLinkedList {
    public Node head; // member variable for SinglyLinkedList

    // constructor for SinglyLinkedList
    public SinglyLinkedList() {
        this.head = null;
    }

    // OTHER METHODS BELOW
    // how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            System.out.println(newNode.value);
            runner.next = newNode;
        }
    }

    // how to remove a node from the END of the list.
    public Integer remove() {
        if (head == null || head.next == null) {
            System.out.println("List is empty!");
            return null;
        } else {
            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            Node removed_item = runner.next;
            runner.next = null;
            return removed_item.value;
        }
    }

    // how to print all the values of each node in the list in order
    public void printValues() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node runner = head;
            while (runner != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
}
