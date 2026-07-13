class exam
{
 public static void main(String args[])
  {
   int arr[]={4,5,0,1,9,0,5,0};
   for(int i=0;i<=arr.length;i++)
    {
      for(int j=0;j<=arr.length;j++)
       {
       if(arr[i]<=arr[j])
        {
         int temp=arr[i];
         arr[j]=arr[i];
         arr[i]=temp;
     {
      System.out.println(arr[i]);
     }
   }
}
}