public class TestLinkedList_Justin_Shaw
{
    public static void main(String[] args)
    {
        TestLinkedList_Justin_Shaw myList = new TestLinkedList_Justin_Shaw();
        myList.addLastNode(3);
        myList.addLastNode(4);
        myList.addLastNode(56);
        myList.print();
        System.out.println(myList.size());
    }

    public Node head, tail;

    // create constructor to create a list with head and tail
    public TestLinkedList_Justin_Shaw()
    {
        head = null;
        tail = null;
    }

    public void addLastNode(int num)
    {
        Node newNode = new Node(num);
        if (size() == 0) {
            head = tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void print()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size()
    {
        Node current = head;
        int count = 0;
        while (current != null)
        {
            current = current.next;
            count++;
        }
        return count;
    }

    // class to create nodes as objects
    private class Node
    {
        // declare element and next
        int element;
        Node next;

        // initialize element and next
        public Node(int e)
        {
            element = e;
            next = null;
        }
    }
}
