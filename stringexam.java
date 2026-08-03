class stringexam
{
 public static void main(String[] args)
 {
    String str="ThisIsAnAutomationEra";
    
	char[] arr=str.toCharArray();
	for(int i=0;i<arr.length;i++){
		
		if(Character.isUpperCase(arr[i])){
		
			System.out.print(" ");
			}
		System.out.print(Character.toLowerCase(arr[i]));
		
	}
   
}
}
