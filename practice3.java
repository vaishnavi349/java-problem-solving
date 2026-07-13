 import java.util.Scanner;
class practice3{
public static void main(String args[]){
int marks;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of Array: ");
marks=sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<size;i++){
 arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
System.out.println(arr[i]);
}
}
}
