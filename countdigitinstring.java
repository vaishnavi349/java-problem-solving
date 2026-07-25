import java.util.Scanner;

class countdigitinstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = "" + n;   // Convert int to String

        System.out.println(s.length());   // Print number of digits
    }
}