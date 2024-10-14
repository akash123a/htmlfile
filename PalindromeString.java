public class PalindromeString {

    public static void main(String[] args) {
        String s = "Hello World";

        String rev = " ";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rev = c + rev;
        }
        if (s.equalsIgnoreCase(rev))
            System.out.println("Yes it is");
        else
            System.out.println("No it is ");

    }

}
