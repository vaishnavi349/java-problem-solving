class problem2{
public static void main(String[]args){
int n[]={3,2,3,4};
for(int i=0;i<n.length;i++){
if(n[i] %2==0){
System.out.println(n[i]+"element is even" );
}
int sum=0;
for(int i=0;i<n.length;i++)
sum=sum+n[i];
System.out.println("sum of array: "+sum);
}
if(sum%3 ==0)
System.out.println("locker is open");
else{
 System.out.println("locker is not open");
}
}
}


