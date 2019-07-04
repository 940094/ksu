// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 9
// IDE: Atom

public class HotelRating
{
    private String[][] ratings; // declare private class variable ratings as a 2D array

    // constructor method that accepts hotel and year arguments as integers
    public HotelRating(int hotels, int years)
    {
        this.ratings = new String[hotels][years]; // set instance variable of ratings equal to 2D array of size rows hotels and columns years

        // input randomly generated string of starts 1-5 into ratings arrays
        for (int i = 0; i < ratings.length; i++)
        {
            for (int j = 0; j < ratings[i].length; j++)
            {
                ratings[i][j] = "";
                int temp = (int)(1 + Math.random() * 5); // set temp equal to integer between 1 and 5
                for (int k = 0; k < temp; k++) // iterate for 1 to 5 times
                {
                    ratings[i][j] += "*"; // add to current cell in ratings a single star
                }
            }
        }
    }

    // method to return array of indices of five star hotels
    public int[] fiveStarsHotels()
    {
        int[] tempListOfFiveStarHotels = new int[ratings.length]; // create a temporary array to count which hotels have a 5 star at least once
        int count = 0;
        for (int i = 0; i < ratings.length; i++) // iterate through each hotel
        {
            for (int j = 0; j < ratings[i].length; j++) // iterate through each year
            {
                if (ratings[i][j].equals("*****")) // if current cell is equal to 5 stars
                {
                    if (tempListOfFiveStarHotels[i] != 1) // and temporary array has not already been flagged as 1
                    {
                        tempListOfFiveStarHotels[i] = 1; // set current index of temporary array to 1 to symbolize a five star hotel
                        count++; // increment count
                    }
                }
            }
        }

        int[] indicesOfFiveStarHotels = new int[count]; // use count to create an array the length of the number of five star hotels
        count = 0;
        for (int i = 0; i < tempListOfFiveStarHotels.length; i++) // iterate over the temporary list of five start hotels
        {
            if (tempListOfFiveStarHotels[i] == 1) // if the current index is equal to 1
            {
                indicesOfFiveStarHotels[count] = i; // set the next cell in the fivestar array to the current index
                count++; // increment count
            }
        }
        return indicesOfFiveStarHotels; // return array of five star hotel indices

    }

    // method to print the average rating for each hotel
    public void averageRatings()
    {
        for (int i = 0; i < ratings.length; i++) // iterate through each hotel
        {
            double hotelAverageRating = 0; // set hotel average rating to 0
            String hotelStarCount = ""; // set star count to empty string
            System.out.print("\tHotel " + i + ":\t\t\t"); // print hotel number
            for (int j = 0; j < ratings[i].length; j++) // iterate over each year
            {
                hotelStarCount += ratings[i][j]; // add star count to total count
            }
            hotelAverageRating = hotelStarCount.length() / (ratings[0].length * 1.00); // calculate the average hotel rating using star count and number of years
            System.out.printf("%1.2f\n", hotelAverageRating); // print average rating
        }
    }

    // method to print indices of hotels with four or more stars
    public void fourOrMoreStars()
    {
        // create an array that flags hotels with four or more stars
        int[] tempListOfFourOrMoreStarHotels = new int[ratings.length]; // create a temporary array to count which hotels have a 5 star at least once
        int count = 0;
        for (int i = 0; i < ratings.length; i++) // iterate through each hotel
        {
            for (int j = 0; j < ratings[i].length; j++) // iterate through each year
            {
                if (ratings[i][j].equals("*****") || ratings[i][j].equals("****")) // if current cell is 4 or 5 stars
                {
                    if (tempListOfFourOrMoreStarHotels[i] != 1) // and if current index of temporary array has not already been flagged with a 1
                    {
                        tempListOfFourOrMoreStarHotels[i] = 1; // set current index of temporary array to 1
                        count++; // increment count
                    }
                }
            }
        }

        // using flagged array, create a new array equal to the number of 4 or 5 star hotels
        String s = ""; // declare and initialize a String variable s to later print
        if (count == 0)
            s += "None"; // if there are no 4 or 5 star hotels print "none"
        else
        {
            int[] indicesOfFourOrMoreStarHotels = new int[count]; // declare and initialize an array the length of the number of 4 or 5 star hotels that will store the indices of 4 or 5 star hotels
            count = 0; // set count to zero

            for (int i = 0; i < tempListOfFourOrMoreStarHotels.length; i++) // iterate over each cell in the temporary array
            {
                if (tempListOfFourOrMoreStarHotels[i] == 1) // if cell is flagged as 1
                {
                    s += i; // add index to the s variable to later print
                    count++; // increment count
                    if (count < indicesOfFourOrMoreStarHotels.length)
                        s += ", "; // add comma after each index
                }
            }
        }
        s += "\n"; // add new line to s variable
        System.out.print(s); // print s variable
    }

    // return true or false if there are any hotels with at least one 5-star year
    public boolean anyFiveStars()
    {
        return (fiveStarsHotels().length != 0); // return true if fiveStarHotels method, which returns array of indices of five star hotels, is not zero length
    }

    // method to return index of best hotel
    public int bestHotel()
    {
        double maxRating = 0; // declare and initialize maxRating as 0
        int maxIndex = -1; // declare and initialize maxIndex as -1
        double currentHotelAvgRating; // declare hotel average rating
        String s; // declare s as String reference variable
        for (int i = 0; i < ratings.length; i++)
        {
            currentHotelAvgRating = 0; // initialize hotel average rating variable as 0
            s = ""; // initialize s reference varaible as empty String
            for (int j = 0; j < ratings[i].length; j++)
            {
                s += ratings[i][j]; // set s equal to current cell's stars plus the rest of the hotel's stars

            }
            currentHotelAvgRating = s.length() / (ratings[0].length * 1.0); // calculate average hotel rating
            if (currentHotelAvgRating > maxRating)
            {
                maxRating = currentHotelAvgRating; // set maxRating to current hotel's average rating
                maxIndex = i; // set maxIndex equal to current index
            }
        }
        return maxIndex; // return maxIndex
    }

    // method to return index of worst hotel
    public int worstHotel()
    {
        double minRating = 6; // delcare and initialize minRating variable as 6 so it's larger than any possible average
        int minIndex = -1; // declare and initialize minIndex to -1 so it's lower than any possible index
        double currentHotelAvgRating; // declare avg rating variable
        String s; // declare string reference variable
        for (int i = 0; i < ratings.length; i++)
        {
            s = ""; // initialize s as empty string
            for (int j = 0; j < ratings[i].length; j++)
            {
                s += ratings[i][j]; // set s varaible to sum of stars in current hotel over years

            }
            currentHotelAvgRating = s.length() / (ratings[0].length * 1.0); // calculate avg hotel rating for current hotel
            if (currentHotelAvgRating < minRating)
            {
                minRating = currentHotelAvgRating; // set min rating to current hotel rating
                minIndex = i; // set min index to current index
            }
        }
        return minIndex; // return min index
    }

    // method to print chart of hotels and their rankings of the years
    public void printChart()
    {
        System.out.print("\t\t"); // print two tabs
        for (int i = 1; i <= ratings[0].length; i++)
        {
            System.out.print("\tYear" + i); // print current year
        }
        System.out.print("\n\t----------------"); // print start of line

        for (int i = 1; i <= ratings[0].length; i++)
        {
            System.out.print("--------"); // print rest of line
        }
        System.out.println();

        for (int i = 0; i < ratings.length; i++)
        {
            System.out.print("\tHotel " + i + ":\t"); // print current hotel
            for (int j = 0; j < ratings[i].length; j++)
            {
                System.out.print(ratings[i][j] + "\t"); // print ratings for each hotel for each year
            }
            System.out.println();
        }
    }
}
