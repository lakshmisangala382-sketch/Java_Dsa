import java.util.Arrays;

public class StringConcepts {
    public static void main(String[] args) {

        String str = "Java Programming";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. equals()
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("Equals: " + s1.equals(s2));

        // 6. equalsIgnoreCase()
        String s3 = "JAVA";
        System.out.println("Equals Ignore Case: "
                + s1.equalsIgnoreCase(s3));

        // 7. contains()
        System.out.println("Contains Java: " + str.contains("Java"));

        // 8. indexOf()
        System.out.println("Index of Programming: "
                + str.indexOf("Programming"));

        // 9. substring()
        System.out.println("Substring: " + str.substring(0, 4));

        // 10. trim()
        String space = "   Hello Java   ";
        System.out.println("Trim: " + space.trim());

        // 11. replace()
        System.out.println("Replace: " + str.replace('a', 'o'));

        // 12. startsWith()
        System.out.println("Starts with Java: " + str.startsWith("Java"));

        // 13. endsWith()
        System.out.println("Ends with ing: " + str.endsWith("ing"));

        // 14. toCharArray()
        char[] arr = s1.toCharArray();
        System.out.println("Character Array: " + Arrays.toString(arr));

        // 15. split()
        String words = "Java is easy";
        String[] result = words.split(" ");

        System.out.println("Split:");
        for (String word : result) {
            System.out.println(word);
        }

        // 16. Reverse String
        String reverse = "Hello";
        StringBuilder sb = new StringBuilder(reverse);
        System.out.println("Reverse: " + sb.reverse());

        // 17. Palindrome
        String pal = "madam";
        String rev = new StringBuilder(pal).reverse().toString();

        if (pal.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // 18. Anagram
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}