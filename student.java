class student

{
   public static void main(String args[])
  {
   int v=200;
   int w=540;
   int tw=0;
   int fw=0;
  

   if((w%2)=0 && (v<w))
    {
     tw=(4*v-w)/2;
     fw=v-tw;
     System.out.println(tw);
     System.out.println(fw);
    }
  else
  {
   System.out.println("Invalid Input");
  }
}
}