// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

/*
This class defines a linked list that stores integer values.
*/

public class LinkedList_Justin_Shaw
{
   public Node head, tail;

   //constructor method to create a list of object with head and tail.
   public LinkedList_Justin_Shaw()
   {
      head = null;
      tail = null;
   }

   //method #0: add node to end of list
   public void addLastNode(int data)
   {
      if (tail == null)
         head = tail = new Node(data); //empty list
      else
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }

   //method #1: add first node
   public void addFirstNode(int data)
   {
         // create and initialize a new node
         Node newNode = new Node(data);

         // generic, or general, case, add as head node
         newNode.next = head;
         head = newNode;

         // if empty list
         if (tail == null) tail = head;
   }

   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
         if (index == 0)  // edge case if index is 0, then add as first node
            addFirstNode(data);
         else if (index >= countNodes()) // edge case if index is greater than or equal to size of linked list, then add as last node
            addLastNode(data);
         else // move pointer to the correct position
         {
            Node current = head;
            Node temp = head.next; // temp is one index, or node, ahead of current
            for (int i = 1; i < index; i++)
            {
                temp = temp.next;
                current = current.next;
            }
            current.next = new Node(data); // set the current node to point to the new node
            (current.next).next = temp; // point the newNode inserted at index to the next node temp
         }

   }

   //method #3: remove first node
   public void removeFirstNode() // return Integer instead of int
   {
        if (countNodes() != 0)  // check if linked list is non-empty
        {
            Node temp = head;
            head = head.next; // head points to second node instead of first
        }
   }

   //method #4: remove last node
   public void removeLastNode()
   {
         int size = countNodes(); // initialize and declare size variable with size returned from countNodes() method
         if (size == 0); // if list empty
         else if (size == 1)
         {
            head = tail = null; // set head and tail to null
         }
         else
         {
            Node current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next; // move to next node
            tail = current; // set tail equal to current
            tail.next = null; // set tail.next equal to null
         }
   }

   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
         int size = countNodes(); // declare and initialize size variable to store size of the linked list
         if (index < 0 || index >= size); // invalid index
         else if (index == size - 1) // last node
            removeLastNode();
         else if (index == 0) // first node
            removeFirstNode();
         else // general case
         {
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next; // move to next node
            current.next = (current.next).next; // set current.next equal to 2 nodes away - essentiall skipping the node at index
         }
   }

   //method #6: countNodes
   public int countNodes()
   {
         //declate a pointer variable called current as well as a size variable
         Node current = head;
         int size = 0;

         // iterate through the linked list, keeping count of size
         while (current != null)
         {
             size++; // increment size
             current = current.next; // move to next node
         }
         return size; // return the list size
   }

   //method #7: printInReverse  (Recursive method)
   public void printInReverse(Node List)
   {
         if (List != null)
         {
             printInReverse(List.next); // recursively call the printInReverse() method
             System.out.print(List.data + "   "); // print the value at the current node
         }
   }

   //method to print out the list
   public void printList()
   {
      Node temp; // declare and initialize a node varaible temp
      temp = head; // initialize the temp variable of type node as head
      while (temp != null)
      {
         System.out.print(temp.data + "   "); // print value at the current node
         temp = temp.next; // move to next node
      }
   }

   //class to create nodes as objects
   private class Node
   {
      private int data;  // data field
      private Node next; // link field

      public Node(int item) // constructor method
      {
         data = item;
         next = null;
      }
   }
}
