public class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }

}

class SinglyLinkedList {
    Node Head;

    void insertIntoBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = Head;
        Head = newNode;
    }

    
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (Head == null) { 
            Head = newNode;
            return;
        }

        Node last = Head;
        while (last.next != null) { 
            last = last.next;
        }
        last.next = newNode; 
    }

    
    void printList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
