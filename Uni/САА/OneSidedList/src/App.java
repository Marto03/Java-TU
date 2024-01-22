class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class App {
    public static Node removeNodes(Node head) {
        Node current = head;
        Node prev = null;
        Node availHead = null;
        Node availTail = null;

        int nodeNumber = 1;

        while (current != null) {
            int value = current.data;
            int expectedValue = 3 * nodeNumber;

            if (value >= expectedValue) {
                if (prev == null) {
                    // Remove the first node
                    head = head.next;
                    current = head; // Cut the connection of the removed node
                } else {
                    prev.next = current.next;
                    current.next = null; // Cut the connection of the removed node
                }

                // Add the removed node to the Avail list
                if (availHead == null) {
                    availHead = current;
                    availTail = current;
                } else {
                    availTail.next = current;
                    availTail = current;
                }

                current = prev.next; // Move to the next node without incrementing nodeNumber
            } else {
                // Move to the next node
                prev = current;
                current = current.next;
                nodeNumber++;
            }
        }

        // Print the Avail list
        System.out.println("Avail list:");
        printList(availHead);

        return head;
    }

    // The rest of the code remains unchanged

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Примерен еднопосочен списък
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(9);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(15);
        head.next.next.next.next.next = new Node(18);

        System.out.println("Original list:");
        printList(head);

        // Извикване на алгоритъма за премахване на вторите възли
        head = removeNodes(head);

        // Извеждане на новия списък след премахване на вторите възли
        System.out.println("Modified list:");
        printList(head);
    }
}
