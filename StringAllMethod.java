import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringAllMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String n = sc.nextLine();

        System.out.println(" First name  : ");
        System.out.println(n);
        System.out.println("Last Name  : ");
        String last = sc.nextLine();
        System.out.println(n.concat(last));
        System.out.println("Delete a String : " + last.replace(last, n));
        System.out.println("Length a String : " + n.length() + " " + last.length());
        String[] countries = { "Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark",
                "France", "Netherlands", "Italy", "Germany" };

        Arrays.sort(countries, Comparator.comparing(String::length));
        System.out.println("Soreted in a length : ");
        for (String c : countries) {
        }   
        System.out.println(Arrays.toString(countries));

    }

}
