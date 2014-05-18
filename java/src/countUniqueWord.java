import java.util.Scanner;


public class countUniqueWord 
{
	public static void main(String[]args)
	{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=scan.nextLine();
        
        String[] words = s.split(" ");
 
        String word = "";
        int [] count=new int[20];
        for (int i=0;i<words.length;i++)
        {
            word = words[i];
            for (int j=0;j<words.length;j++)
            {
                if (words[j].equals(word))
                {
                    count[i]++;
//                    if (i != j)
//                    {
//                        count[j] = 0;
//                    }
                }
            }
        }
        
        for (int y=0;y<words.length;y++)
        {
          System.out.println(words[y]+"\t"+count[y]);
           if(count[y]==1)
           {
        	   System.out.println("unique words are:"+words[y]);
           }
        }
	}
}
