class problem9{
public static void main(String args[]){
int budget=30;
int packagekilometer[]={12,5};
int packageCost[]={12,5};
int b=0;
int e=0;
int q=0;
int d=0;
int ride=0;

for(int i=0;i<packagekilometer.length;i++)
{
 if(budget%packageCost[i] ==0 )
{
   b=i;
   e=packageCost[i];
}
}
   q= packagekilometer[b];
   d=budget/e;

   ride= d*q;
  System.out.println(ride);

}
}
 