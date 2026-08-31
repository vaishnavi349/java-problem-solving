class CountFrequencyofEachCharacter
{
public static void main(String[] args)
{
  String str="banana";

  for(int i=0;i<str.length();i++)  
   {
     int c=0;
     for(int j=0;j<str.length();j++)
     {
      if(str.charAt(i)==str.charAt(j))
 	{
	  c++;          
	}
      }
     System.out.println(str.charAt(i)+"="+c);
   }
}
}