class Frequency
{
public static void main(String[] args)
{
    //initialize array
  int []arr = new int[] {7,8,2,8,2,1,7,7,8};
   //array fr will store frequencies of element 
  int []fr = new int[arr.length];
  int visited = -1; 
   for(int i=0;i<arr.length;i++)
   {
      int count = 1;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                //to avoid counting same element again
                fr[j]=visited;
            }
        }
        if(fr[i]!=visited)
        fr[i]=count;
    }

    //display the frequency of each element present in array

    System.out.println("ELEMENT | FREQUENCY");
    for(int i=0;i<fr.length;i++)
    {
        if(fr[i]!=visited)
        {
        System.out.println("  "+ arr[i] +" | " + fr[i]);
        }
    }
}
}
