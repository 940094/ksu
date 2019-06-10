// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class MyTest_Justin_Shaw
{
   public static void main (String[] args) // program main method
   {
      LinkedList_Justin_Shaw myList = new LinkedList_Justin_Shaw(); //create a list object
      Scanner input = new Scanner(System.in);

      // prompt user for next list command until user quits
      while (true)
      {
          System.out.print("\n\n----MAIN MENU----\n0) Exit Program\n1) Add First Node\n2) Add Last Node\n3) Add At Index\n4) Remove First Node\n" +
                                "5) Remove Last Node\n6) Remove At Index\n7) Print List Size\n8) Print List (forward)\n9) Print List (reverse)\n\n" +
                                "Please enter a number from the above list:  "); // print menu
          int methodCall = input.nextInt();

          // exit Program
          if (methodCall == 0)
            break;

          // execute inputted list command
          else if (methodCall == 1) // print out addFirstNode() test
          {
              System.out.print("\nPlease enter a node value to add to list: "); // prompt user for node value
              int num = input.nextInt();
              System.out.println("\nTesting method addFirstNode()");
              System.out.println("Adding value " + num + " as first node.");
              System.out.print("List content before adding " + num + " is: ");
              printList(myList); // print the list
              myList.addFirstNode(num); // call the addFirstNode() method with inputted value
              System.out.print("List content after adding " + num + " is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 2) // print out addLastNode() test
          {
              System.out.print("\nPlease enter a node value to add to list: "); // prompt user for node value
              int num = input.nextInt();
              System.out.println("\nTesting method addLastNode()");
              System.out.println("Adding value " + num + " as last node.");
              System.out.print("List content before adding " + num + " is: ");
              printList(myList); // print the list
              myList.addLastNode(num); // call the addLastNode() method with inputted value
              System.out.print("List content after adding " + num + " is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 3) // print out addAtIndex(index, data) test
          {
              System.out.print("\nPlease enter an index followed by an integer value (e.g. 2 99): "); // prompt user for node value and index
              int index = input.nextInt();
              int num = input.nextInt();
              System.out.println("\nTesting method addAtIndex(index, data)");
              System.out.println("Adding node at index " + index + " of value " + num + ".");
              System.out.print("List content before adding node at index " + num + " is: ");
              printList(myList); // print the list
              myList.addAtIndex(index, num); // call the addAtIndex() method with inputted value
              System.out.print("List content after ading node at index " + num + " is:   ");
              printList(myList); // print the list
          }
          else if (methodCall == 4) // print out removeFirstNode() test
          {
              System.out.println("\nTesting method removeFirstNode()");
              System.out.print("List content before removing first node is: ");
              printList(myList); // print the list
              myList.removeFirstNode(); // call the removeFirstNode() method
              System.out.print("List content after removing first node is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 5) // print out removeLastNode() test
          {
              System.out.println("\nTesting method removeLastNode()");
              System.out.print("List content before removing last node is: ");
              printList(myList); // print the list
              myList.removeLastNode(); // call the removeLastNode() method
              System.out.print("List content after removing last node is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 6) // print removeAtIndex(index) test
          {
              System.out.print("\nPlease enter an index to remove from list: "); // prompt user for index
              int index = input.nextInt();
              System.out.println("\nTesting method removeAtIndex(index)");
              System.out.print("List content before removing node at index " + index + " is: ");
              printList(myList); // print the list
              myList.removeAtIndex(index); // call the removeAtIndex() method with inputted index
              System.out.print("List content after removing node at index " + index + " is:  ");
              printList(myList);
          }
          else if (methodCall == 7)
          {
              // print out countNodes() test
              System.out.println("\nTesting method countNodes()");
              System.out.println("Counting nodes.");
              System.out.print("List contents: ");
              printList(myList); // print the list
              System.out.print("List size is:  ");
              System.out.println(myList.countNodes()); // print the list size
          }
          else if (methodCall == 8)
          {
              // print out printInReverse(L) test
              System.out.println("\nTesting method printList()");
              System.out.print("List contents: ");
              printList(myList); // print the list (forward)
          }
          else if (methodCall == 9)
          {
              // print out printInReverse(L) test
              System.out.println("\nTesting method printInReverse(List)");
              System.out.print("List contents (in reverse): ");
              if (myList.countNodes() != 0) myList.printInReverse(myList.head); // print the list (reverse)
              else System.out.print("List is Empty"); // else print "list is empty"
              System.out.println();
          }
          else
          {
              System.out.println("\nInvalid command."); // print invalid input if user input not 0 to 9
          }
      }
      System.out.print("Final list contents: "); // print list values after user exits
      printList(myList); // print list
   }

   // method to either print list or a string letting user know the list is empty
   public static void printList(LinkedList_Justin_Shaw myList)
   {
       if (myList.countNodes() != 0) myList.printList(); // print list as long as list is not empty
       else System.out.print("List is Empty"); // else print "list is empty"
       System.out.println();
   }
}
