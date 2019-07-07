// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

/*
This class defines a queue that stores a variety of data types.
*/

public class Queue_Justin_Shaw<E>
{
   public Node<E> head, tail;

   //constructor method to create a list of object with head and tail.
   public Queue_Justin_Shaw()
   {
      head = null;
      tail = null;
   }

   // method to insert element at end of list
   public void enqueue(E data)
   {
      if (head == null)
         head = tail = new Node<E>(data); //empty list
      else
      {
         tail.next = new Node<E>(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }

   // method to retrieve and remove first element from list
   public E dequeue()
   {
        if (countNodes() != 0)  // check if linked list is non-empty
        {
            Node<E> temp = head;
            head = head.next; // head points to second node instead of first
            temp.next = null;
            return temp.data;
        }
        return null;

   }

   // method to peek at front head node
   public E front()
   {
       if (countNodes() == 0) return null;
       return head.data;
   }

   // method to return size of queue
   public int size()
   {
       return countNodes();
   }

   // method to see if queue is empty
   public boolean isEmpty()
   {
       return (countNodes() == 0);
   }

   // method to count nodes in queue
   public int countNodes()
   {
         //declate a pointer variable called current as well as a size variable
         Node<E> current = head;
         int size = 0;

         // iterate through the linked list, keeping count of size
         while (current != null)
         {
             size++; // increment size
             current = current.next; // move to next node
         }
         return size; // return the list size
   }

   // method to print out the list
   public void printList()
   {
      Node<E> temp; // declare and initialize a node varaible temp
      temp = head; // initialize the temp variable of type node as head
      while (temp != null)
      {
         System.out.print(temp.data + "   "); // print value at the current node
         temp = temp.next; // move to next node
      }
   }

   // class to create nodes as objects
   private class Node<E>
   {
      private E data;  // data field
      private Node next; // link field

      public Node(E item) // constructor method
      {
         data = item;
         next = null;
      }
   }
}
