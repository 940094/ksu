// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 6
// IDE: Atom

public class DistinctValues
{
    public static int[] getValues(int[] list)
    {
        int[] tempList = new int[10]; // declare and initialize an empty array of size 10 with zero values
        int count = 0;
        boolean zero = true; // flag for any zero values in array

        // iterate over user inputted list and track unique values as well as length of new list
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] == 0 && zero) // add first zero value from user inputted array to temp array
            {
                zero = false;
                tempList[count] = list[i]; // add num from old list to new list
                count++; // increment count to keep track of new list size
            }
            else if (linearSearch(tempList, list[i]) == -1) // add unique values from user inputted array to temp array
            {
                tempList[count] = list[i]; // add num from old list to new list
                count++; // increment count to keep track of new list size
            }
        }

        // remove excess zeros from current list
        int[] newList = new int[count]; // declare and initialize a newList array variable of size count
        System.arraycopy(tempList, 0, newList, 0, count); // copy the tempList array to the newList array from index zero to index count

        // return an array of Distinct Values
        return newList;
    }
    public static int linearSearch(int[] list, int key) // search given array for key
    {
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] == key)
                return i; // return index of found key
        }
        return -1; // return -1 if key is not in array
    }
}
