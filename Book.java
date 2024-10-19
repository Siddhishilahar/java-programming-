import java.util.*;
public class Book
{
    public static void main(String []args)
    {
        int Readers,no_of_pages,days;
        int ReaderData[][];

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter number of readers:");
        Readers=sc.nextInt();

        ReaderData=new int[Readers][];
        for(int row=0;row<Readers;row++)
        {
            System.out.println("enter number of pages:");
            no_of_pages=sc.nextInt();
            days=1000/no_of_pages;
            ReaderData[row]=new int[days];

            for(int col=0;col<ReaderData[row].length;col++)
            {
                ReaderData[row][col]=no_of_pages;
            }
        }

        System.out.print("\t");
        for(int col=1;col<6;col++)
        {
            System.out.print("day"+col+"\t");
        }
        System.out.println();
        for(int row=0;row<Readers;row++)
        {
            System.out.println("Reader"+(row+1)+"\t");
            for(int col=0;col<ReaderData[row].length;col++)
            {
                System.out.println(ReaderData[row][col]+"\t");
            }
            System.out.println();
            
        }

    }
}
