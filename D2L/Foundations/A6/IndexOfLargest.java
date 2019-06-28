// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 6
// IDE: Atom

public class IndexOfLargest
{
    public static int findIndex(int[] list) // program findIndex to return index of largest integer in an array
    {
        int max = list[0]; // declare and initialize max to first element in array
        int maxIndex = 0; // declare and initialize maxIndex to index of value currently stored in variable max
        for (int i = 1; i < list.length; i++) // iterate over the list starting at the second value
        {
            if (list[i] > max)
            {
                max = list[i]; // set max equal to current value
                maxIndex = i; // set maxIndex equal to current index
            }
        }
        return maxIndex; // return index of largest integer in the array
    }
}
