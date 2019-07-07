// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestQueue_Justin_Shaw
{
   public static void main (String[] args) // program main method
   {
      Queue_Justin_Shaw<Integer> myList = new Queue_Justin_Shaw<Integer>(); //create a list object
      Scanner input = new Scanner(System.in);

      // prompt user for next list command until user quits
      while (true)
      {
          System.out.print("\n\n----MAIN MENU----\n0) Exit Program\n1) Enqueue Node\n2) Dequeue Node\n" +
                                "3) Print Front Node\n4) Print List Size\n5) Print If Queue Is Empty\n6) Print Node Count\n7) Print List\n\n" +
                                "Please enter a number from the above list:  "); // print menu
          int methodCall = input.nextInt();

          // exit Program
          if (methodCall == 0)
            break;

          // execute inputted list command
          else if (methodCall == 1) // print out enqueue(e) test
          {
              System.out.print("\nPlease enter an integer value to add to Queue: "); // prompt user for node value
              int num = input.nextInt();
              System.out.println("\nTesting method enqueue(e)");
              System.out.println("Adding value " + num + " as next node.");
              System.out.print("List content before adding " + num + " is: ");
              printList(myList); // print the list
              myList.enqueue(num); // call the enqueue(e) method with inputted value
              System.out.print("List content after adding " + num + " is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 2) // print out dequeue() test
          {
              System.out.println("\nTesting method dequeue()");
              System.out.print("List content before removing node is:\t");
              printList(myList); // print the list
              System.out.println("The value at the head of queue is:\t" + myList.dequeue()); // call the dequeue() method
              System.out.print("List content after removing node is:\t");
              printList(myList); // print the list
          }
          else if (methodCall == 3) // print out front() test
          {
              System.out.println("\nTesting method front()");
              System.out.print("List content before returning head of queue is: ");
              printList(myList); // print the list
              System.out.println("The value at the head of queue is:\t\t" + myList.front()); // call the front() method
              System.out.print("List content after returning head of queue is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 4)
          {
              // print out size() test
              System.out.println("\nTesting method size()");
              System.out.println("Counting nodes.");
              System.out.print("List contents: ");
              printList(myList); // print the list
              System.out.print("List size is:  ");
              System.out.println(myList.size()); // print the list size
          }
          else if (methodCall == 5)
          {
              // print out isEmpty() test
              System.out.println("\nTesting method isEmpty()");
              if (myList.isEmpty()) System.out.println("List is empty.");
              else
              {
                  System.out.println("List is not empty.");
                  System.out.print("List contents: ");
                  printList(myList); // print the list
              }
          }
          else if (methodCall == 6)
          {
              // print out countNodes() test
              System.out.println("\nTesting method countNodes()");
              System.out.println("Counting nodes.");
              System.out.print("List contents: ");
              printList(myList); // print the list
              System.out.print("Node count is: ");
              System.out.println(myList.countNodes()); // print the list size
          }
          else if (methodCall == 7)
          {
              // print out size() test
              System.out.println("\nTesting method printList()");
              System.out.print("List contents: ");
              printList(myList); // print the list
          }
          else
          {
              System.out.println("\nInvalid command."); // print invalid input if user input not 0 to 5
          }
      }
      System.out.print("Final list contents: "); // print list values after user exits
      printList(myList); // print list
   }

   // method to either print list or a string letting user know the list is empty
   public static void printList(Queue_Justin_Shaw<Integer> myList)
   {
       if (myList.size() != 0) myList.printList(); // print list as long as list is not empty
       else System.out.print("List is Empty"); // else print "list is empty"
       System.out.println();
   }
}
