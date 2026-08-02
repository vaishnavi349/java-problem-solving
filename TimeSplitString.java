class TimeSplitString
{
  public static void main(String[] args)
  {
   String time="7:05:45pm";
   String str[]=time.split(":");
   String h=str[0];
   String m=str[1];
   String s=str[2];
   
   int hi=Integer.valueOf(h);
   char ch=time.charAt(time.length()-2);
   if(ch=='p')
   {
    int nh=hi+12;
    System.out.println(nh+":"+m+":"+s.substring(0,2));
   }
   else
   {
    System.out.println(time);
   }
}
}