public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "abba";
        int len = palindrome.length();
        System.out.println(isPalindrome(palindrome));
    }

    public static boolean isPalindrome(String palindrome){
        String clean = palindrome.toLowerCase();
        String rev = new StringBuffer(clean).reverse().toString();
        if(clean.equals(rev)){
            return true;
        }
        return false;
    }
//        String clean = palindrome.toLowerCase();
//        StringBuilder dest = new StringBuilder(len);
//        StringBuilder dest2 = new StringBuilder(len);
//        for (int i = (len - 1); i >= 0; i--) {
//            dest.append(clean.charAt(i));
//            dest2.append(clean.charAt(i));
//        }
//        if (dest.compareTo(dest2)!=0) {
//            System.out.println("Not a Palindrome");
//        } else {
//            System.out.println("Is a Palindrome");
//        }
//        System.out.println(clean.toString());
//        System.out.println(dest.toString());
}
