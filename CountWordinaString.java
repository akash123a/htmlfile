public class CountWordinaString {

    public static void main(String[] args) {
        String s = "This is a String";

        s += "";
        String word = " ";
        int end = 0, position = 0, count = 0;
        while (s.indexOf(' ', position) > 0) {
            end = s.indexOf(' ', position);
            word = s.substring(position, end);
            count++;
            position = end + 1;
        }
        System.out.print(count);

    }
}
