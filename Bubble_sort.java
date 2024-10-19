class Bubble_sort
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
public static void main(String args[])
{
  int arr[]={29,7,8,17,16};

  //bubble sort 
  for(int i=0;i<arr.length-1;i++)//i means n it will continuse loop n-1
  {
    for(int j=0;j<arr.length-i-1;j++)
    {
        if(arr[j]>arr[j+1])
        {
            //swap value
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
  }
  printArray(arr);
}
}