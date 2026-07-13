class stringproblem
{
 public static void main(String args[])
 {
   String str="ThisIsAnAutomationEra";
   String result=" ";
   for(int i=0;i<str.length();i++)
   {
       char ch=str.charAt(i);
       if(ch>='A'&&ch<='z')
       {
           result=result+" ";
       }
       result=result+ch;
       
   }
   System.out.println(result.toLowerCase());
}
}