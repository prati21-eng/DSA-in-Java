import java.util.Scanner;

class Main   
{

    private static int findGcd(int num1 , int num2)
    {
        if(num1==0)
            return num2;
        
        if(num2 ==0 )
        {
            return num1;
        }
        if(num1 == num2)
            return  num1;
        if(num1 > num2)
        {
            return findGcd(num1-num2,num2);
        }
        if(num1 < num2)
        {
            return findGcd(num1,num2-num1);
        }
        return num1;
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1= sc.nextInt();

        System.out.println("Enter Second Number :");
        int num2 =sc.nextInt();

        int gcd = findGcd(num1,num2);
        System.out.println("Gcd of "+num1+" and "+num2+" is "+gcd);
    }
}