class FirstNonRepeatingCharacter
{
	public static void main(String[] args)
	{
	 String str="swiss";
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
	
		if(c==1)
		{
		  System.out.println("First non-repeating character = " + str.charAt(i));
		  break;
                  
		}
	       }
}
}
