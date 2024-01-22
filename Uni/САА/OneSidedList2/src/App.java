class Node {
    int data;
    Node next;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}

public class App {
    public static void addNodes(Node head) {
        Node current = head;
        int index = 1;
        int negativeCount = 0;
        while (current != null) {
            int value = current.data;
            if (value < 0)
                negativeCount++;
            if (value < 0 && negativeCount == 3 && index % 2 == 0) {
                Node newNode = new Node(current.data / 2);
                if (current.next != null) {
                    newNode.next = current.next;
                    current.next = newNode;
                    current = newNode.next;
                }
            }
            current = current.next;
            index++;
        }
    }
    // Метод за отпечатване на еднопосочен списък

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) throws Exception {
        // Примерен еднопосочен списък
        Node head = new Node(5);
        head.next = new Node(-3);
        head.next.next = new Node(8);
        head.next.next.next = new Node(-7);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(-11);
        head.next.next.next.next.next.next = new Node(218);

        // Извикване на метода за добавяне на нов елемент
        addNodes(head);
        // Отпечатване на списъка след добавянето на новите елементи
        printLinkedList(head);
        head = null;
    }
}
