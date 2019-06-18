public class TestStack_Justin_Shaw<E>
{
    public static void main(String[] args) // driver method
    {
        TestStack_Justin_Shaw<String> myStack = new TestStack_Justin_Shaw<String>();
        String s = "123+*";

        for (int i = 0; i < s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (Character.isDigit(sub.charAt(0))) myStack.addLastNode(sub); // add digit
            else // perform operation on digits
            {
                String top1 = myStack.top();
                myStack.removeLastNode();
                String top2 = myStack.top();
                myStack.removeLastNode();
                String r = calc(sub, top1, top2);
                myStack.addLastNode(r);
            }

        }

        System.out.print("Final answer: ");
        myStack.print();

    }

    public static String calc(String operand, String top1, String top2)
    {
        // System.out.println(top1);
        // System.out.println(top2);
        // System.out.println(operand);

        String temp;
        if (operand.equals("+")) temp = Integer.parseInt(top1) + Integer.parseInt(top2) + "";
        else temp = Integer.parseInt(top1) * Integer.parseInt(top2) + "";
        System.out.println("result: " + temp);
        return temp;
    }


    Node<E> head, tail;

    // constrcuctor for stack to initialize head and tail as null
    public TestStack_Justin_Shaw()
    {
        head = null;
        tail = null;
    }

    // add to top (same as addLastNode)
    public void addLastNode(E e)
    {
        // if stack is empty
        if (tail == null)
        {
            head = tail = new Node<E>(e);
        }
        // if stack is not empty
        else
        {
            tail.next = new Node<E>(e);
            tail = tail.next;
        }
    }

    // remove from top (same as removeLastNode)
    public void removeLastNode()
    {
        if (tail == null) //edge case
        {
        }
        else if (size() == 1) //edge case if size is 1
        {
            head = null;
            tail = null;
        }
        else
        {
            // iterate until node is just before last node (size - 1)
            Node<E> current = head;
            for (int i = 1; i < size() - 1; i++)
            {
                current = current.next;
            }
            tail = current; // set tail equal to second to last node
            tail.next = null; // set next node equal to null
        }
    }

    // return top value w/o removing it
    public E top()
    {
        return tail.data;
    }


    // print list
    public void print()
    {
        Node<E> current = head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // count size
    public int size()
    {
        int count = 0;
        Node<E> current = head;
        while (current != null)
        {
            current = current.next;
            count++;
        }
        return count;
    }

    // create node object
    private class Node<E>
    {
        E data;
        Node next;

        public Node(E e)
        {
            data = e;
            next = null;
        }
    }
}
