public class Demo {
//to find bit of given number at given  position
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println("Enter The number  :");
        int num=sc.nextInt();

        System.out.println("Enter the position :");
        int pos=sc.nextInt();

        int mask=1<<(pos-1);

        if((num&mask)==0)
        {
            System.out.println("Bit at Position "+pos+" is 0");
        }
        else
        {
            System.out.println("Bit at Position "+pos+" is 1");
        }
    }
}