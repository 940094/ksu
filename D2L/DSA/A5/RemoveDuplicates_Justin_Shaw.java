// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

import java.io.*; // import java.io Classes
import java.util.*; // import java.util Classes

public class RemoveDuplicates_Justin_Shaw
{
    public static void main(String[] args) throws IOException
    {
        String again = "y";
        while (again.equals("Y") || again.equals("y")) //use sentinel loop to prompt user to re-run program
        {
            Scanner input = new Scanner(System.in); // declare and initialize new scanner object

            // prompt user to chose from user input or file input from menu
            System.out.println("\nMenu");
            System.out.println("----------");
            System.out.println("0 - Quit Program");
            System.out.println("1 - Remove Duplicates From User Input");
            System.out.println("2 - Remove Duplicates From File");
            System.out.print("\nPlease type a number from the above menu (e.g. 1): ");
            String menu = input.next();

            if (menu.equals("0")) // quit program
            {
                System.exit(1);
            }

            else if (menu.equals("1")) // read user input from keyboard
            {
                input = new Scanner(System.in); //initialize new scanner object

                // add user inputted value to BST object
                BST_Justin_Shaw<String> tree = new BST_Justin_Shaw<>(); // create an instance of the BST object
                System.out.print("Please enter text you'd like to remove duplicates from as a string (e.g., e i a b): "); // prompt user to enter values
                String s1 = input.nextLine();
                Scanner scan = new Scanner(s1); // declare and initialize scanner of user inputted string, s1
                while(scan.hasNext())
                {
                    tree.insert(scan.next()); // add next node to tree
                }

                // print user input
                System.out.println("Original Text:");
                System.out.println(s1);

                // traverse tree and print nodes in sorted order
                System.out.println();
                System.out.println("Processed Text:");
                tree.inorder(); // call method inorder from tree object
                System.out.println();
            }
            else if (menu.equals("2")) // read file input
            {
                // prompt user for sourceFile and targetFile until valid values are inputted
                File sourceFile;
                File targetFile;
                while (true)
                {
                    // prompt user for sourceFile and targetFile
                    System.out.print("Please enter a source file and target file as Strings (e.g. sourceFile.txt targetFile.txt): ");
                    String sourceFileName = input.next();
                    String targetFileName = input.next();
                    sourceFile = new File(sourceFileName);
                    targetFile = new File(targetFileName);

                    // stop prompting user for input if source file exists and target file does not exist
                    if (sourceFile.exists() && !targetFile.exists())
                        break;
                    else
                        // check if source file exists
                        if (!sourceFile.exists())
                        {
                            System.out.println("Source file does not exist.");
                        }

                        // check if target file exists
                        if (targetFile.exists())
                        {
                            System.out.println("Target file " + targetFileName + " already exists.");
                        }
                }

                // declare and initialize reader and writer for sourceFile and targetFile, respectively
                Scanner input2 = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);

                // create new BST object
                BST_Justin_Shaw<String> tree = new BST_Justin_Shaw<>(); // create an instance of the BST object

                // populate the BST object
                while (input2.hasNext())
                {
                    String s1 = input2.next(); // look at next string
                    tree.insert(s1); // store in tree
                }

                // traverse tree and print nodes in sorted order
                String result = tree.inorderString();
                output.print(result);

                System.out.println("\nDuplicates removed and uniques added to file.");

                output.close(); // close the targetFile
            }
            else // invalid menu input
            {
                System.out.println("\nInvalid menu input.");
                continue;
            }

            // prompt user to re-run program
            Scanner input2 = new Scanner(System.in); // declare and initialize new scanner object
            System.out.print("\nDo you want to re-run program (Y/N)? ");
            again = input2.next();
            System.out.println();
        }
    }
}
