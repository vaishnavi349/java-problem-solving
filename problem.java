class problem10{
public Static void main(String args[]){
 int arr[]={35,35,35,35};
int value=0;
int num=0;
for(int i=0;i<arr.length;i++){
 if(arr[i]<value){
  value=arr[i];
}
}
for(int i=0;i<arr.length;i++){
int num=arr[i]+1;
arr[i]++;
}
System.out.println(num);
}
}