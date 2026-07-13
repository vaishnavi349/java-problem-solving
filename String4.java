class String4{
    public static void main(String args[])
{     
     
     String str="hello this is alpha 5051 and 9475";
      char[] arr=str.toCharArray();
       for(int i=0;i<arr.length;i++)
       {
          {
             char ch=str.charAt(i);
             System.out.println(str.charAt(i));
          
          if(ch>='0' && ch<='9')
        {
          System.out.println("digit is found: ");
        }
       }
     }
}
}