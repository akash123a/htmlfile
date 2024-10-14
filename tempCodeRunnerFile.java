public class PrintWordInSeparateLine {
    public static void main(String[] args) {
        String s = "This is a Word";
        String w = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Accumulate characters into the word
            if (c != ' ') {
                w += c;
            }
            // When encountering a space, print the word and reset
            else {
                System.out.println(w); // Print the full word
                w = ""; // Reset the word accumulator
            }
        }
        // To print the last word since there's no space at the end
        if (!w.isEmpty()) {
            System.out.println(w);
        }
    }
}
