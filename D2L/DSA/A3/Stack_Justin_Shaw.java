// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

/*
This class defines a linked list used for a Stack.
*/

public class Stack_Justin_Shaw<E>
{
   public Node<E> head, tail;

   //constructor method to create a list of object with head and tail.
   public Stack_Justin_Shaw()
   {
      head = null;
      tail = null;
   }

   //method #1: add node to top of stack
   public void push(E data)
   {
      if (tail == null)
         head = tail = new Node<E>(data); //empty list
      else
      {
         tail.next = new Node<E>(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }

   //method #2: remove node from top of stack
   public void pop()
   {
         int size = size(); // initialize and declare size variable with size returned from size() method
         if (size == 0); // if list empty do nothing
         else if (size == 1)
         {
            head = tail = null; // set head and tail to null
         }
         else
         {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next; // move to next node
            tail = current; // set tail equal to current
            tail.next = null; // set tail.next equal to null
         }
   }

   // method #3: return value at top of Stack in list/stack without removing that value
   public E top()
   {
       if (size()==0) return null; // return null for empty list
       else return tail.data; // return top node data for non-empty list
   }

   //method #4: count size of stack
   public int size()
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

   // method #5: check if stack is empty; if so, return true
   public boolean isEmpty()
   {
       return (size() == 0);
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
