import java.util.LinkedList;

public class Node {
    Node head;
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    public void printLinkedList(Node list) {

        Node currentNode = list.head;
        System.out.println("Linked list: ");

        while (currentNode != null) {

            System.out.println("Current field= " + currentNode.data);

            currentNode = currentNode.next;

        }
    }

    public boolean linkedListSearch(Node head, int a) {

        Node current = head;

        while (current != null) {

            if (current.data == a) {
                return true;
            }
            current = current.next ;
        }
        return false ;


    }

    public int listCount(){
        Node temp = head;
        int count = 0;

        while (temp != null){
            count ++;
            temp =temp.next;
        }
        return count ;
    }

}