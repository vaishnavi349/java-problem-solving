class matrix2d
{
  public static void main(String[] args)
  {
    int arr[][]={
                  {60,70,80},
                  {40,50,60},
                  {30,40,50}
                 };
       int c=0;
      for(int i=0;i<arr.length;i++)
        {
         int v=0;
         for(int j=0;j<arr[i].length;j++)
          {
            //int v=0;
             v+=arr[i][j];
            //System.out.println(v);
          }

          int avg=v/3;
          if(avg>=50)
          {
           c++;
          }
       }
       System.out.println(c);
}
}