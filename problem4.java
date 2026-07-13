class problem4{
public static void main(String args[]){
int a[]={20,15,26,2,98,6};
int b[]={2,6,15,20,26,98};

for(int i=0;i<=a.length;i++){
 for(int j=0;j<a.length;j++){
 if(a[i]==b[j]){
  System.out.println(j+1);
}
}
}
}
}


