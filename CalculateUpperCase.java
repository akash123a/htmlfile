public class CalculateUpperCase {

    public static void main(String[] args) {
        String s = "14This is A String";
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            char            c = s.charAt(i);
            if (Character.isUpperCase(c)) {

                countUpper++;
            } else if (Character.isLowerCase(c)) {

                countLower++;

            } else if (Character.isDigit(c)) {

                countDigit++;
            }
        }
        System.out.print(countUpper);
        System.out.println("");
        System.out.print(countLower);
        System.out.println("");
        System.out.println(countDigit);
    }
}
