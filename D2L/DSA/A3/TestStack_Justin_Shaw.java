// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestStack_Justin_Shaw
{
   public static void main (String[] args) // program main method
   {
      Stack_Justin_Shaw<Integer> myList = new Stack_Justin_Shaw<Integer>(); //create a list object
      Scanner input = new Scanner(System.in);

      // prompt user for next list command until user quits
      while (true)
      {
          System.out.print("\n\n----MAIN MENU----\n0) Exit Program\n1) Push Node\n2) Pop Node\n" +
                                "3) Print Top Node\n4) Print List Size\n5) Print If Stack Is Empty\n\n" +
                                "Please enter a number from the above list:  "); // print menu
          int methodCall = input.nextInt();

          // exit Program
          if (methodCall == 0)
            break;

          // execute inputted list command
          else if (methodCall == 1) // print out push(e) test
          {
              System.out.print("\nPlease enter an integer value to add to Stack: "); // prompt user for node value
              int num = input.nextInt();
              System.out.println("\nTesting method push(e)");
              System.out.println("Adding value " + num + " as next node.");
              System.out.print("List content before adding " + num + " is: ");
              printList(myList); // print the list
              myList.push(num); // call the push(e) method with inputted value
              System.out.print("List content after adding " + num + " is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 2) // print out pop() test
          {
              System.out.println("\nTesting method pop()");
              System.out.print("List content before removing top node is: ");
              printList(myList); // print the list
              myList.pop(); // call the pop() method
              System.out.print("List content after removing top node is:  ");
              printList(myList); // print the list
          }
          else if (methodCall == 3) // print out top() test
          {
              System.out.println("\nTesting method top()");
              System.out.print("List content before returning value at top of stack is: ");
              printList(myList); // print the list
              System.out.println("The value at the top of stack is:\t\t\t" + myList.top()); // call the top() method
              System.out.print("List content after returning value at top of stack is:  ");
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
          else
          {
              System.out.println("\nInvalid command."); // print invalid input if user input not 0 to 5
          }
      }
      System.out.print("Final list contents: "); // print list values after user exits
      printList(myList); // print list
   }

   // method to either print list or a string letting user know the list is empty
   public static void printList(Stack_Justin_Shaw<Integer> myList)
   {
       if (myList.size() != 0) myList.printList(); // print list as long as list is not empty
       else System.out.print("List is Empty"); // else print "list is empty"
       System.out.println();
   }
}
