 import java.util.*;
 class string{
public static void main(String args[])
{
  String str="LLLVVPP";

  char[] arr=str.toCharArray();
 for(int i=0;i<arr.length;i++)
{
 int count=1;
	 for(int j=i+1;j<arr.length;j++)
	{
    	if(arr[i]==arr[j])
	{     
 	 count++;
	}
	else{
  	break;
	}
}

if(count>1)
{
 System.out.println(arr[i]+""+count);
}
else
{
 System.out.println(arr[i]);
}
}
}
}
 
 