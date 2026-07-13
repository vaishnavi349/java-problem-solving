class string2{
public static void main(String args[]){
String str="aab";
String str2="xxy";
int counter1=0;
int counter2=0;
for(int i=0;i<str.length();i++)
    {
     if(str.charAt(0)==str.charAt(1))
     
     counter1++;
    }

for(int i=0;i<str2.length();i++)
  {
   if(str.charAt(0)==str.charAt(1))
   counter2++;
  }
if(counter1==counter2)
{
  System.out.println( "true");
}
else
{
System.out.println( "false");
}
 }
}
