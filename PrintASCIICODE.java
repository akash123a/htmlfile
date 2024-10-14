public class PrintASCIICODE {
    public static void main(String[] args) {
        String s = "HelloWorld";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c + " " + (int) c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(" " + c + " : " + (int) c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(" " + c + " : " + (int) c);
        }
    }

}
