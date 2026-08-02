class zerosEnd{
	public static void main(String args[])
	{
		int arr[]={10,2,0,30,4,0,0,45};
		int j=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}