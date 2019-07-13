// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

public interface Tree_Justin_Shaw<E> extends Iterable<E>
{
    // method search return true if the element is in the tree
    public boolean search(E e);

    // method insert return true if the element is added succsessfully
    public boolean insert(E e);

    // method delete returns true if the element is removed from the tree successfully
    public boolean delete(E e);

    // method inorder prints the nodes in inorder traversal
    public void inorder();

    // method preorder prints the nodes in preorder traversal
    public void preorder();

    // method postorder prints the nodes in postorder traversal
    public void postorder();

    // method getSize returns the number of elements in the Tree
    public int getSize();

    // method isEmpty returns true if the tree is empty
    public boolean isEmpty();

    // method clear removes all elements from the tree
    public void clear();
}
