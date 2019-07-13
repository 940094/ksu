// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom


public class TestBST_Justin_Shaw
{
	public static void main(String[] args)
	{
		// Create a BST
		BST_Justin_Shaw<String> tree = new BST_Justin_Shaw<>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");

		// Traverse tree
		System.out.print("Inorder (sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nThe number of nodes is " + tree.getSize());

		// Search for an element
		System.out.print("\nIs Peter in the tree? " + tree.search("Peter"));

		// Get a path from the root to Peter
		System.out.print("\nA path from the root to Peter is: ");
		java.util.ArrayList<BST_Justin_Shaw.TreeNode<String>> path = tree.path("Peter");
		for (int i = 0; path != null && i < path.size(); i++)
		System.out.print(path.get(i).element + " ");

		// create a new BST with numbers array and print in order
		Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
		BST_Justin_Shaw<Integer> intTree = new BST_Justin_Shaw<>(numbers);
		System.out.print("\nInorder (sorted): ");
		intTree.inorder();
        System.out.println();
	}
}
