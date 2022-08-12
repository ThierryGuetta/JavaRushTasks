package MyTests;

public class CharArrayReverse {
    public static void main(String[] args) {
        String str = "Hello World!";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - 1 - i]);
        }
    }
}
