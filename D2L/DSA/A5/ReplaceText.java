// ReplaceText.java

import java.io.*;
import java.util.*;

public class ReplaceText
{
    public static void main(String[] args) throws Exception
    {
        // check command line parameter usage
        if (args.length != 2)
        {

            System.out.println("Usage: java ReplaceText sourceFile targetFile");
            System.exit(1);
        }

        // check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists())
        {
            System.out.println("Source file does not exist.");
            System.exit(2);
        }

        // check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists())
        {
            System.out.println("Target file " + args[1] + " already exists.");
            System.exit(3);
        }

        try (
            // create input and output files
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        )
        {
            int num = 2;
            String numString = num + "";
            String paranthesisString = "\t";
            while (input.hasNext())
            {
                String s1 = input.next(); // look at next string
                // if match, replace with blank and make new line
                if (s1.equals(numString))
                {
                    //String s2 = s1.replaceAll(numString, "");
                    output.println();
                    output.print(paranthesisString);
                    num++;
                    numString = num + "";
                }
                else if (s1.equals("{"))
                {
                    output.println();
                    output.print(paranthesisString);
                    output.print(s1);
                    paranthesisString += "\t";
                }
                else if (s1.equals("}"))
                {
                    paranthesisString =  paranthesisString.substring(0, paranthesisString.length() - 1);
                    output.print(s1);
                }
                else
                    output.print(s1 + " ");
            }
        }
    }
}
