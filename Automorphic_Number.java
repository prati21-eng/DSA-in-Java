public class Automorphic_Number
{
    public static void main(String[] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n=sc.nextInt();
        int sq = n*n;
        String s1 = String.valueOf(sq);
        String s2 = String.valueOf(n);
        if (s1.endsWith(s2))
            System.out.println("Automorphic ");
        else
            System.out.println("Not");
        



    }
}