import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        String str = sc.nextLine();
        char[] crr = str.toCharArray();
        Arrays.sort(crr);
        str = new String(crr);  // Convert sorted char array back to string

        int count = 1;  // Start count as 1 since the first character is counted
        String ans = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans += str.charAt(i) + "" + count;
                count = 1;  // Reset count for the next character
            }
        }
        // Handle the last character
        ans += str.charAt(str.length() - 1) + "" + count;

        System.out.println("Answer:");
        System.out.println(ans);
    }
}
