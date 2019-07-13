// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

public class TestBSTDelet_Justin_Shaw
{
	public static void main(String[] args)
	{
		// create BST object
		BST_Justin_Shaw<String> tree = new BST_Justin_Shaw<>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		printTree(tree);

		// print tree after deleting George
		System.out.println("\nAfter delete George:");
		tree.delete("George");
		printTree(tree);

		// print tree after deleting Adam
		System.out.println("\nAfter delete Adam:");
		tree.delete("Adam");
		printTree(tree);

		// print tree after deleting Michael
		System.out.println("\nAfter delete Michael:");
		tree.delete("Michael");
		printTree(tree);
	}

	public static void printTree(BST_Justin_Shaw tree) // program printTree method
	{
		// Traverse tree and print inorder, postorder, and preorder results
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();

		// print size of tree
		System.out.print("\nThe number of nodes is " + tree.getSize());
		System.out.println();
	}
}
