//find in string consonant and print them
class consonant
{
   public static void main(String[] args)
   {
    String s= "Vaishnavi";
     char ch=0;
     int c=0;
    for(int i=0;i<s.length();i++)
    {
     ch=s.charAt(i);
     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
       }
     else 
       {
         c++;
       } 
    }
   System.out.println(c);
}
}