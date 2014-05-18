
import java.util.Scanner;

/**
 *
 * @author Milton
 */
public class bad 
{
    private static String mintermSwitch1(int value)
    {
        String minTerms;
        switch (value)
        {
            case 0: minTerms = "A'";
                    break;
            case 1: minTerms = "A";
                    break;
            default: minTerms = "Invalid Number";
                    break;            
        }
        return minTerms;
    }
    
    private static String mintermSwitch2(int value)
    {
        String minTerms;
        switch (value)
        {
            case 0: minTerms = "A'B'";
                    break;
            case 1: minTerms = "A'B";
                    break;
            case 2: minTerms = "AB'";
                    break;
            case 3: minTerms = "AB";
                    break;            
            default: minTerms = "Invalid Number";
                    break;            
        }
        return minTerms;
    }
    
    private static String mintermSwitch3(int value)
    {
        String minTerms;
        switch (value)
        {
            case 0: minTerms = "A'B'C'";
                    break;
            case 1: minTerms = "A'B'C";
                    break;
            case 2: minTerms = "A'BC'";
                    break;
            case 3: minTerms = "A'BC";
                    break;
            case 4: minTerms = "AB'C'";
                    break;
            case 5: minTerms = "AB'C";
                    break;
            case 6: minTerms = "ABC'";
                    break;
            case 7: minTerms = "ABC";
                    break;
            default: minTerms = "Invalid Number";
                    break;            
        }
        return minTerms;
    }
    
    private static String mintermSwitch4(int value)
    {
        String minTerms;
        switch (value)
        {
            case 0: minTerms = "A'B'C'D'";
                    break;
            case 1: minTerms = "A'B'C'D";
                    break;
            case 2: minTerms = "A'B'CD'";
                    break;
            case 3: minTerms = "A'B'CD";
                    break;
            case 4: minTerms = "AB'CD";
                    break;
            case 5: minTerms = "A'BC'D";
                    break;
            case 6: minTerms = "A'BCD'";
                    break;
            case 7: minTerms = "A'BCD";
                    break;
            case 8: minTerms = "AB'C'D'";
                    break;
            case 9: minTerms = "AB'C'D";
                    break;
            case 10: minTerms = "AB'CD'";
                    break;
            case 11: minTerms = "AB'CD";
                    break;
            case 12: minTerms = "ABC'D'";
                    break;
            case 13: minTerms = "ABC'D";
                    break;
            case 14: minTerms = "ABCD'";
                    break;
            case 15: minTerms = "ABCD";
                    break;
            default: minTerms = "Invalid Number";
                    break;            
        }
        return minTerms;
    }
    
    public static void main(String[] args) 
    {
        int var;
        String minTerm;
        
        System.out.print("Number of variable: ");
        Scanner inputVar = new Scanner(System.in);
        var = inputVar.nextInt();
        
        if(var == 1)
        {
            System.out.print("Minterm numbers: ");
            Scanner input = new Scanner(System.in);
            minTerm = input.next();

            String[] values = minTerm.split(",");
            
            System.out.println("\nThe algebraic function:");
            System.out.print("F(A) = ");
            for(int  i = 0; i < values.length; i++)
            {
                System.out.print(mintermSwitch1(Integer.parseInt(values[i])) + " + ");
            }
            System.out.println("\b\b");
        }
        else if(var == 2)
        {
            System.out.print("Minterm numbers: ");
            Scanner input = new Scanner(System.in);
            minTerm = input.next();

            String[] values = minTerm.split(",");
            
            System.out.println("\nThe algebraic function:");
            System.out.print("F(A, B) = ");
            for(int  i = 0; i < values.length; i++)
            {
                System.out.print(mintermSwitch2(Integer.parseInt(values[i])) + " + ");
            }
            System.out.println("\b\b");
        }
        else if(var == 3)
        {
            System.out.print("Minterm numbers: ");
            Scanner input = new Scanner(System.in);
            minTerm = input.next();

            String[] values = minTerm.split(",");
            
            System.out.println("\nThe algebraic function:");
            System.out.print("F(A, B, C) = ");
            for(int  i = 0; i < values.length; i++)
            {
                System.out.print(mintermSwitch3(Integer.parseInt(values[i])) + " + ");
            }
            System.out.println("\b\b");
        }
        else if(var == 4)
        {
            System.out.print("Minterm numbers: ");
            Scanner input = new Scanner(System.in);
            minTerm = input.next();

            String[] values = minTerm.split(",");
            
            System.out.println("\nThe algebraic function:");
            System.out.print("F(A, B, C, D) = ");
            for(int  i = 0; i < values.length; i++)
            {
                System.out.print(mintermSwitch4(Integer.parseInt(values[i])) + " + ");
            }
            System.out.println("\b\b");
        }
        else
        {
            System.out.println("Enter variable between 1 and 4");
        }
    }
}
