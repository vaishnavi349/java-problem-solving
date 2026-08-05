class targetedelement
{
  public static void main(String[] args)
  {
   int element=23;
   int arr[]={29,45,67,23};
   for(int i=0;i<arr.length;i++)
   {
     for(int j=0;j<arr.length;j++)
      {
          if(arr[j]==element && i==j)
           {
           System.out.println("found the element: "+j);
           }
           else
               {
                  System.out.println("element is not found: ");
                }
        }
    }
}
}
