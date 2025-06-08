public class Demo
{

    //replacing the bit with specified given bit
    public static void main(String[] args)
    {

        // java.util.Scanner sc=new java.util.Scanner(System.in);
        int num=5;
        int pos=2;
        int rep=1;
        int mask=1<<(pos-1);
        if(rep==1)
        {
            int out=num | mask;
            System.out.println("Answer :"+out);
            System.out.println("Binary :"+Integer.toBinaryString(out));
        }
        else{
            int out=num & (~mask);
            System.out.println("Answer :"+out);
            System.out.println("Binary :"+Integer.toBinaryString(out));
        }

    }
}