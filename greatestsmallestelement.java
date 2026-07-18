class greatestsmallestelement{
  public static void main(String[] args)
 { 
  int arr[]={3,9,5};
  int largest=0;
  int smallest=arr[0];
  for(int i=0;i<arr.length;i++)
    {
          if(arr[i]>largest)
          {
             largest=arr[i];
      
           }
          if(arr[i]<smallest)
           {
             smallest=arr[i];
           }
   }
   System.out.println(largest);
   System.out.println(smallest);
}
}