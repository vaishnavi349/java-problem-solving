 import java.util.Scanner;
 class problem3{
public static void main(String args[]){
int a[]= new int[6];
int temp=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the values of array: ");
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<=a.length;i++){
 for(int j=i+1;j<a.length;j++){
 if(a[i]>a[j]){
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}
}
for(int i=0;i<=a.length;i++){
System.out.println(a[i]+"  ");
}
for(int i=0;i<=a.length;i++){
 for(intj= )
 


}
}