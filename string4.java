class string4 {
    public static void main(String[] args) {

        String s = "noon";
        String e = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            e = e + s.charAt(i);
        }

        if (s.equals(e)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}