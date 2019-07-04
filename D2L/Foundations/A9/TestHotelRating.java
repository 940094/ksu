// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 9
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestHotelRating
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("Y") || again.equals("y")) // sentinel loop to allow user to re-run program
        {
            // read user inputted number of utels
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter an integer for the number of hotels (e.g. 4): "); // prompt user to enter an integer for number of hotels
            int hotels = input.nextInt();
            while (hotels < 1)
            {
                System.out.print("Please enter a positive integer for the number of hotels (e.g. 4): "); // re-prompt user to enter an integer
                hotels = input.nextInt();
            }

            // read user inputted number of years
            System.out.print("Please enter an integer for the number of years (e.g. 4): "); // prompt user to enter an integer for number of years
            int years = input.nextInt();
            while (years < 1)
            {
                System.out.print("Please enter a positive integer for the number of years (e.g. 4): "); // re-prompt user to enter an integer
                years = input.nextInt();
            }

            HotelRating myRatings = new HotelRating(hotels, years); // decalre and initialize myRatings HotelRating object with user inputted number of hotels and years

            System.out.print("Five stars hotels indices:\t\t"); // print five star hotel indices
            if (myRatings.fiveStarsHotels().length == 0)
                System.out.print("None"); // print none if fivestarhotels method returns an array the length of zero

            for (int i = 0; i < myRatings.fiveStarsHotels().length; i++)
            {
                System.out.print(myRatings.fiveStarsHotels()[i]); // print current index of fiveStarsHotels
                if (i < myRatings.fiveStarsHotels().length - 1)
                    System.out.print(", "); // print comma to seperate indices of fiveStarHotels
            }

            System.out.print("\nAverage ratings are:\n"); // print average ratings header
            myRatings.averageRatings(); // call averageRatings method to print average ratings for each hotel

            System.out.print("Four or more stars hotels indices:\t"); // print four or more star hotels header
            myRatings.fourOrMoreStars(); // call fourOrMoreStars method to print hotel indices with fourOrMoreStars

            System.out.println("Any five stars hotel?\t\t\t" + myRatings.anyFiveStars()); // print true/false if any five star hotels

            System.out.println("Best hotel index:\t\t\t" + myRatings.bestHotel()); // print index of best rated hotel

            System.out.println("Worst hotel index:\t\t\t" + myRatings.worstHotel()); // print index of worst rated hotel

            System.out.println("Ratings chart:"); // print header for ratings chart
            myRatings.printChart(); // call printChart method to print a chart with hotel ratings for each year

            //prompt user to re-run program
            System.out.print("Do you want to re-run program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
