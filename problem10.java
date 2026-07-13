class problem10{
public static void main(String args[]){
 int arr[]={35,35,35,35};
int value=0;
int num=0;
for(int i=0;i<arr.length;i++){
 if(arr[i]<value){
  value=arr[i];
}
}
for(int i=0;i<arr.length;i++){
value[i]=arr[i]+3;
num++;
 }
System.out.println(num);
}
}