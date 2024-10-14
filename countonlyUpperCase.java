public class countonlyUpperCase {

    public static void main(String[] args) {
        String s = "14This is A String";
        String sU = " ";
        String sL = " ";
        int countUpper = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sU += c;
            }
            if (Character.isLowerCase(c)) {
                sL += c;
            }
        }
        System.out.print(sU + " ");
        System.out.print(sL + " ");
    }
}
