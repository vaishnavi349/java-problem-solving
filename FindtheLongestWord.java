class FindtheLongestWord{
public static void main(String[] args)
{
String str= "I love programming in Java";
String[] words=str.split(" ");
int max=0;
String longest = "";
for(int i=0;i<words.length;i++)
{

 if(words[i].length() > max)
{
 max=words[i].length();
 longest=words[i];
 
}
}
System.out.println(max);
System.out.println(longest);

}
}