public class Demo
{
    public static void main(String[] args)
    {
        int num=5;
        int pos=2;

        int b_mask=1<<(pos-1);

        int out=num | b_mask;
        System.out.println("Final Output :"+out);
        System.out.println("In binary :"+Integer.toBinaryString(out));
    }
}