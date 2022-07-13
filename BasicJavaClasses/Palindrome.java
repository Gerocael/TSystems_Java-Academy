public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "Toto";
        int len = palindrome.length();
        String clean = palindrome.toLowerCase();
        StringBuilder dest = new StringBuilder(len);
        for (int i = (len - 1); i >= 0; i--) {
            dest.append(clean.charAt(i));
        }
        StringBuilder dest2 = new StringBuilder(len);
        for (int i = (len - 1); i >= 0; i--) {
            dest2.append(dest.charAt(i));
        }
        if (dest.compareTo(dest2)!=0) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Is a Palindrome");
        }
        System.out.println(clean.toString());
        System.out.println(dest.toString());
    }
}
