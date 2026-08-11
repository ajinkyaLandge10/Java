package Logical_Programs;

// Using recursion
public class ReverseString_05 {

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Ajinkya";
        System.out.println(reverse(str));
    }
}
