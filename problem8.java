class problem8{
public static void main(String args[]){

int arr[]={2,1,5,6,2,3};
int max=0;
int larger=0;
for(int i=0;i<arr.length;i++){
 if(arr[i]>max)
  {
   max = arr[i];
   larger=i;
  }
}
System.out.println(larger);
}
}