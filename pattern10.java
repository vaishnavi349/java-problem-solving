import java.util.Scanner;
class pattern10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter any number: ");
int n= sc.nextInt();

for(int i=1;i<=2*n-1;i++){
int star=i;
if(i>n) star=2*n-i;
for(int j=1;j<=star;j++){
System.out.print("*");
}
System.out.println();
}
}
}