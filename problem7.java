 class problem7{
 public static void main(String args[]){
 int a[]={7,0,0,1,7,7,2,7,7};
 int counter=0;
 for(int i=0;i<=a.length;i++){
    for(int j=i+1;j<a.length;j++){
         if(a[i]==a[j]){
        counter++;
    }
}
 }
    
System.out.println();
}
}