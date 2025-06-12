import java.util.Arrays;

public class Anagram_Sring
{
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter first String :");
        String f_string=sc.nextLine();
        System.out.println("Enter second string :");
        String s_string=sc.nextLine();
        if(f_string.length()==s_string.length())
        {
            char a1[] = f_string.toCharArray();
            char a2[] = s_string.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            String s1 = String.valueOf(a1);
            String s2 = String.valueOf(a2);
            if (s1.equals(s2))
                System.out.print("Anagram ");
            else 
                System.out.print("Not Anagram ");            
        }
        else
        {
            System.out.println("String is not angram");
        }
    }
}
