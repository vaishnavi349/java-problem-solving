class prime{
       public static void main(String args[])
{
        int num1=20;
        int num2=25;
        int prime=0;
      for(int i=20;i<=25;i++)
      {
        int counter=0;
        for(int j=1;j<=25;j++)
        {
         if(i%j==0)
           {
            counter++;
           }
      
        }
         if(counter==2)
          { 
           prime=i;
          }
        
      }
     System.out.println(prime);
      int sum=0;
   int r=prime%10;
    //sum=r+sum;
    prime=prime/10;
    sum=r+prime;
   System.out.println(sum);
} 
  
}


          
